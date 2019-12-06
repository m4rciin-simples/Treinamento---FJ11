import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor a ser fatorado: ");
		int numero = Integer.parseInt(sc.next());
		int soma = numero;

		for (int i = numero; i > 1; i--) {
			soma = soma * (i - 1);
		}
		System.out.println("Fatorial de " + numero + ": " + soma);

	}

}
