import java.util.Scanner;

public class Circulo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o numero de linhas: ");
		double linhas = Double.parseDouble(sc.next());
		double raio = 1;
		// raio = Math.sqrt(raio);
		// double diametro = 2 * raio;
		double a = 0;
		double b = 0;

		for (int i = (int) linhas; i < 10; i--) {
			for (int j = (int) linhas; j > raio; j--) {
				raio = (Math.pow(i, 2) - Math.pow(a, 2)) + (Math.pow(j, 2) - Math.pow(b, 2));
				if (j > raio) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		
		sc.close();

	}

}
