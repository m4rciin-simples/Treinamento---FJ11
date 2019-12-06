import java.util.Scanner;

public class ParImpar {
	
	public static void main(String[] args) {
		
		Scanner  sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: "); 
		int numero = Integer.parseInt(sc.next());
		
		if (numero % 2 == 0) {
			System.out.println("Numero eh par!");
		} else {
			System.out.println("Numero eh impar!");
		}
		
	}

}
