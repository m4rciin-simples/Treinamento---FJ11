

public class Fibonacci {

	static int calculaFibo(int n, int arr[]) {

		int retorno = 0;

		if (n == 0) {
			retorno = 0;
		} else if (n == 1 || n == 2) {
			retorno = 1;
		} else {
//			int a = arr[n-1];
//			int b = arr[n-2];			
			int fibo = arr[n-1] + arr[n-2];
			retorno = fibo;
		}
		return retorno;

	}

}
