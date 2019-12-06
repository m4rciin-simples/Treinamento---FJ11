package br.com.caelum.contas.main;

import java.util.Scanner;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double soma = 0;

		System.out.print("Quantas contas serão inseridas: ");
		int qtd = Integer.parseInt(sc.next());

		Conta[] contas = new Conta[qtd];

		for (int i = 0; i < contas.length; i++) {
			Conta cc = new ContaCorrente();
			contas[i] = cc;
			contas[i].deposita((i + 1) * 100.0);
			System.out.println(contas[i].getSaldo());
		}

		for (int j = 0; j < contas.length; j++) {
			soma += contas[j].getSaldo();
		}
		System.out.println("A media eh: " + soma / contas.length);
	}

}
