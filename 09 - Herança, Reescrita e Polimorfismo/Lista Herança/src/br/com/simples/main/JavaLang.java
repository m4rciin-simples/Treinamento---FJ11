package br.com.simples.main;

public class JavaLang {

	public static void main(String[] args) {

		StringBuilder strBuilder = new StringBuilder();
		String palavra = "Socorram-me, subi no onibus em Marrocos";
		String p = "anotaram a data da maratona";
		String plvr = palavra.replaceAll(" ", "");
		String str = p.replaceAll(" ", "");

		int n = plvr.length() - 1;
		int x = str.length() - 1;
		System.out.println("Tamanho 01: " + n);
		System.out.println("Tamanho 02: " + x);
		
		System.out.println("");
		System.out.println(palavra);
		
		for (int i = 0; n >= i; n--) {
			System.out.print(plvr.charAt(n));
		}

		System.out.println("");
		System.out.println("");
		System.out.println(p);
		for (int i = 0; x >= i; x--) {
			strBuilder.append(str.charAt(x));
		}
		
		System.out.println(str.toString());

	}

}
