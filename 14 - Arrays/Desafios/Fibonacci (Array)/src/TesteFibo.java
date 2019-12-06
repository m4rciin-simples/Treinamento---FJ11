import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class TesteFibo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("Tamanho da sequencia: ");
		n = sc.nextInt();
		
		int[] fibo = new int[n];
		
		for (int i = 0; i < n; i++) {
			int resultado = Fibonacci.calculaFibo(i, fibo);
			fibo[i] = resultado;
			System.out.print(resultado + " ");
		}

	
	}

}
