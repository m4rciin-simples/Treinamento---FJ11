  
package fibonacci;

import java.util.Scanner;

public class Principal {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Tamanho da sequencia: ");
		int n = sc.nextInt();
		
		int[] test = new int[n];
		
		for (int i = 0; i < n; i++) {
			test[i] = Fibonacci.calculaFibonacci(i);
			System.out.print(test[i]+ " ");
		}
				
//		System.out.println(Fibonacci.calculaFibonacci(n));
	}

}