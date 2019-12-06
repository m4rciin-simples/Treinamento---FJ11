import java.util.Scanner;

public class Losango {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com a altura: ");
		int altura = Integer.parseInt(sc.next());
		System.out.print("Entre com o comprimento: ");
		int comp = Integer.parseInt(sc.next());
		int aux = altura;

		System.out.printf("\n");
		for (int i = 1; i <= altura; i++) {
			for (int j = 0; j <= aux; j++) {
				System.out.print(" ");
			}aux--;
			for (int k = 0; k < comp; k++) {
				System.out.print(" * ");
			}

			System.out.printf("\n");
			
		}

	}

}
