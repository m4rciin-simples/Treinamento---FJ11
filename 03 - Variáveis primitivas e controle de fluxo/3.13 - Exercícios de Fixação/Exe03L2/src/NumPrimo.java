import java.util.Scanner;

public class NumPrimo { 
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int numero = Integer.parseInt(sc.next()); 
		
		
		for (int i = 2; i <= numero; i++) {
			int cont = 0;
			for(int j = 2; j <= i; j++) {				
				if (i % j == 0) {
					cont++;				
				}				
			}
			if (cont < 2) {
				System.out.println("Numero primo: " + i);
			}
		}
		
	}

}
