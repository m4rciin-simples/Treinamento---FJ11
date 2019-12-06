package br.com.caelum.contas.modelo;

import br.com.caelum.contas.exception.SaldoInsuficienteException;

public abstract class Conta {

	private double saldo;
	private String titular;
	private int numero;
	private String agencia;

	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Voce tentou depositar" + "um valor negativo");
		} else {
			this.saldo += valor;
		}
	}

	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new IllegalArgumentException("Saldo insuficiente, " + "tente um valor menor.");
		} 
		if (valor < 0) {
			throw new SaldoInsuficienteException(valor);
		}
			this.saldo -= valor;
	}

	public abstract String getTipo();

	public void transfere(double valor, Conta conta) throws SaldoInsuficienteException {
		if (valor <= this.saldo) {
			this.saca(valor);
			conta.deposita(valor);
		} else {
			System.out.println("Valor insuficiente.");
		}

	}
	
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		Conta outraConta = (Conta) obj;
		
		return this.getNumero() == outraConta.getNumero() && 
				this.getAgencia().equals(outraConta.getAgencia());
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	@Override
	public String toString() {
		return "[titular= " + getTitular().toUpperCase() +
				", numero= " + getNumero() +
				", agencia= " + getAgencia() +
				", tipo=" + getTipo() + "]";
	}

}
