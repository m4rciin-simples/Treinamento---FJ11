
public class Fibonacci {
	
	static int calculaFibo(int n) {

		if ( n == 1 || n == 2) {
			return 1;			
		} else {
			int fibo= calculaFibo(n-1) + calculaFibo(n-2);
			return fibo;
		}		
	}

}
