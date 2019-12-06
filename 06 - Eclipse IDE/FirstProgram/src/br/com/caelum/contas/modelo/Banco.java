package br.com.caelum.contas.modelo;

import br.com.caelum.javafx.api.controllers.ContasController;

public class Banco {

	private String nome;
	private int numero;
	private Conta[] contas;
	int cont = 0;
	int n = 10;

	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		while (this.contas == null) {
			this.contas = new ContaCorrente[n];
			if (this.contas != null) {
				n = n * 2;
			}
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public Conta[] getContas() {
		return contas;
	}

	public void adiciona(Conta c) throws Exception {
		if (cont < contas.length) {
			if (contas[cont] == null) {
				contas[cont] = c;
				cont++;
			}
		} else {

//			System.out.println("Vetor sem mais espaços!");
//			System.out.println("");
//			throw new IllegalAccessError("Vetor sem espaços!");
		}
	}

	public boolean contem(Conta c) {
		boolean resposta = false;

		for (int i = 0; i < contas.length; i++) {
			if (c.equals(contas[i])) {
				resposta = true;
				break;
			}
		}
		return resposta;
	}

	public void verificaConta(Conta c) throws Exception {
		if (contem(c) == true) {
			System.out.println("Conta existente!");
			mostraDados(c);
		}else if (contem(c) == false) {
			System.out.println("Conta não existente!");
		} else {
			System.out.println("");
			System.out.println("Erro desconhecido!");
			throw new IllegalAccessError("Erro desconhecido!");
		}
	}

	public String mostraDados(Conta c) {
		String dados = "";

		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null) {
				dados = "[Titular: " + c.getTitular();
				dados += ", Numero : " + c.getNumero();
				dados += ",  Agencia: " + c.getAgencia();
				dados += ",  Saldo: " + c.getSaldo() + "]";
			}
		}
		return dados;
	}

}
