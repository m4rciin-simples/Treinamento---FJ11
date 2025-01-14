package br.com.caelum.contas;

import br.com.caelum.contas.exception.SaldoInsuficienteException;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {

	private Conta conta;
	
	public void criaConta(Evento evento) {
		String tipo = evento.getSelecionadoNoRadio("tipo");
		if (tipo.equals("Conta Corrente")) {
			this.conta = new ContaCorrente();
		} else {
			this.conta = new ContaPoupanca();
		}
		this.conta.setAgencia(evento.getString("agencia"));
		this.conta.setNumero(evento.getInt("numero"));
		this.conta.setTitular(evento.getString("titular"));
	}
	
	public void deposita(Evento evento) {
		double valorDigitado = evento.getDouble("valorOperacao");
		this.conta.deposita(valorDigitado);
	}
	public void saca(Evento evento) {
		double valor = evento.getDouble("valorOperacao");
		try {
			this.conta.saca(valor);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void transfere(Evento evento) {
		Conta destino = (Conta) evento.getSelecionadoNoCombo("destino");
		try {
			conta.transfere(evento.getDouble("valorTransferencia"), destino);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
