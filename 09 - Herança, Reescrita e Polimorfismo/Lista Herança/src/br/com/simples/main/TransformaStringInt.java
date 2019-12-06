package br.com.simples.main;

public class TransformaStringInt {

	public static void main(String[] args) {

		String x = "762";
		int a = x.length()-1;
		int soma = 0;
		int c = 0;

		System.out.println(a);
		for (int n = 0; n < x.length(); n++) {
			int i = 0;
			char aux = x.charAt(n);
			c = aux - 0;

			switch (c) {
			case 48:
				c = 0;
				soma += c * (Math.pow(10, a--));
				break;
			case 49:
				c = 1;
				soma += c * (Math.pow(10, a--));
				break;
			case 50:
				c = 2;
				soma += c * (Math.pow(10, a--));
				break;
			case 51:
				c = 3;
				soma += c * (Math.pow(10, a--));
				break;
			case 52:
				c = 4;
				soma += c * (Math.pow(10, a--));
				break;
			case 53:
				c = 5;
				soma += c * (Math.pow(10, a--));
				break;
			case 54:
				c = 6;
				soma += c * (Math.pow(10, a--));
				break;
			case 55:
				c = 7;
				soma += c * (Math.pow(10, a--));
				break;
			case 56:
				c += 8;
				soma += c * (Math.pow(10, a--));
				break;
			case 57:
				c = 9;
				soma += c * (Math.pow(10, a--));
				break;				
			}
		}
		System.out.println("Valor transformado em inteiro: " + soma);
	}

}
