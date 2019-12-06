package br.com.caelum.contas.modelo;

import br.com.caelum.contas.exception.SaldoInsuficienteException;

public class ContaCorrente extends Conta implements Tributavel {

	@Override
	public String getTipo() {		
		return "Conta Corrente";
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		if (valor < 0) {
			throw new IllegalArgumentException("Voce tentou sacar um valor negativo.");
		}
		if (getSaldo() < valor) {
			throw new SaldoInsuficienteException(valor);
		}
		this.setSaldo(getSaldo() - (valor + 0.10));
	}

	
	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}

	
}
