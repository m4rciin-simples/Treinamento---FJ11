class Teste {
	
	public static void main(String[] args) {
		
		Fibonacci fibo = new Fibonacci();
		
		for (int i = 1; i <= 6; i++) {
			int resultado = Fibonacci.calculaFibo(i);
			System.out.print(resultado + " ");
		}
	}
}
