class TestaFibonacci {
	
	static int calculaFibo(int n) {
			
		return n == 1 || n == 2 ?  1 : (calculaFibo(n-1) + calculaFibo(n-2));	
	}

	
	public static void main(String[] args) {
		
		for (int n = 1; n <= 6; n++) {
			int resultado = calculaFibo(n);
			System.out.print(resultado + " ");
		}
	}
}


