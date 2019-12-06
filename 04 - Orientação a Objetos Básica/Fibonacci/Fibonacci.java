public class Fibonacci {
		
	int calculaFibo(int n) {
		int fibo = 0;
		int fibo1 = n-2;;
		int fibo2 = n-1; 
		
		if(n < 2){
			fibo = n - fibo;
		} else {			
			fibo = fibo1 + fibo2; 
		}
		
		return fibo;
	}
}	