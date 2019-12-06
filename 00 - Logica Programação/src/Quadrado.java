import java.util.Scanner;

public class Quadrado {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Entre com o valor do lado A: ");
		int ladoA = Integer.parseInt(sc.next());
		//int ladoB = ladoA;
		
		for(int i = 0; i < ladoA; i++) {
			for(int k = 0; k < ladoA; k++) {
				System.out.print(" * ");
			}
			System.out.printf("\n");
		}
	}

}
