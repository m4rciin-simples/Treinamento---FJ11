package br.com.caelum.contas.main;

public class TestaSplit {

	public static void main(String[] args) {

		String frase = "Socorram-me, subi no ônibus em Marrocos";
		String[] palavras = frase.split(" ");
		int n = palavras.length;

		System.out.println("Tamanho do vetor: " + n);
		for (int i = 0; i < n; i++) {
			System.out.print(palavras[i] + " ");
		}
		System.out.println("");
		n--;
		for (int j = 0; n >= j; n--) {
			System.out.print(palavras[n] + " ");
		}

	}

}
