import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a altura do triangulo: ");
		int altura = Integer.parseInt(sc.next());

		int aux = altura + 2;
		int cont = 0;

		for (int i = 0; i < altura + 2; i++) {

			for (int j = 1; j < aux; j++) {
				System.out.print(" ");
			}
			aux--;

			for (int k = 1; k < (i + cont); k++) {
				System.out.print("*");
			}
			cont++;
			System.out.printf("\n");
		}

	}

}
