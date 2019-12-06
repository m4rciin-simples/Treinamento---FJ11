
class Conta {

	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private double limite;
	private int identificador;
	private String cpf;
	
	public Conta() {
		
	}

	public Conta(String titular, double saldo) {
		this.titular = titular;	
		this.saldo = saldo;
	}	
	
	public String getTitular() {
		return this.titular;		
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	/*public int getIdentificador() {
		return this.identificador; 
	}

	public void setIdentificador() {
		if (identificador == 1) {			
			this.identificador = identificador;	
		}else {
			this.identificador = identificador;	
		}
	}	*/
	 
	public boolean saca(double valor) {
		if (this.saldo < saldo) {
			return false;	
		} else {
			this.saldo = this.saldo - valor;
			return true;
		}		
	}	

	public void deposita(double quantidade) {
		this.saldo += quantidade;
	}	
	
	public boolean transfere(Conta destino, double valor) {
		boolean retirou = this.saca(valor);
		if(retirou == false) {
			return false;
		} else {
			destino.deposita(valor);
			return true;
		}
	}	
	public double calculaRendimento() {
		this.saldo = saldo * 0.1;
		return saldo;
	}
	
	public String recuperaDados() {
		String dados = "\nTitular: " + getTitular();
		dados += "\nSaldo: " + this.saldo;
		
		return dados;
	}	
	public String getCpf() {
		return this.cpf = cpf; 
	}
	public void setCpf(String cpf) throws Exception{
		
		if (checkCpf(cpf)) {
			this.cpf = cpf;
		}else {
			System.out.println("Precisa de um numero de CPF valido para que a conta seja criada");
		}			
	}
	
	static boolean checkCpf(String cpf) throws Exception {
		int a = 0; 		
		int b = 0;
		int soma = 0; 
		int soma2 = 0; 
		boolean resposta = true;
		
		String cpfReplace = cpf.replace(".", "").replace("-", ""); 
		
		int tam = cpfReplace.length();
		int tam2 = cpfReplace.length();
		//System.out.println("Tamanho do cpf: " + tam);
		System.out.println("");
		
		if (cpfReplace.equals("00000000000") ||
            cpfReplace.equals("11111111111") ||
            cpfReplace.equals("22222222222") || cpfReplace.equals("33333333333") ||
            cpfReplace.equals("44444444444") || cpfReplace.equals("55555555555") ||
            cpfReplace.equals("66666666666") || cpfReplace.equals("77777777777") ||
            cpfReplace.equals("88888888888") || cpfReplace.equals("99999999999") ||
            (cpfReplace.length() != 11)){				
									
			throw new IllegalArgumentException("CPF invalido");	
			//resposta = false;			
		}else {	          	
		
			//Converte a String em inteiro, e faz o calculo do valor(charAt) pelo decremento do tamanho da String (10->2)
			for (int i = 0; i < cpfReplace.length()-2; i++) {			
				a = Integer.parseInt(cpfReplace.valueOf(cpfReplace.charAt(i)));
				tam--;
				soma += a * tam;	
			}	
		
			//Imprime a soma
			//System.out.println("Soma: " + soma);
		
			//Faz o calculo da soma, multiplicando por 10 e posteriormente dividindo por 11
			int vldFirstDig = soma * 10;
		
			int aux = vldFirstDig % 11;
			if (aux == 10) {
				aux = 0;
			}

			//System.out.println(aux);
			//System.out.println("");

			for (int j = 0; j < cpfReplace.length()-1; j++) {
				b = Integer.parseInt(cpfReplace.valueOf(cpfReplace.charAt(j)));
				soma2 += b * tam2;
				tam2--;			
			}	
			//Imprime a soma
			//System.out.println("Soma: " + soma2);
		
			//Faz o calculo da soma, multiplicando por 10 e posteriormente dividindo por 11
			int vldFirstDig2 = soma2 * 10;
		
			int aux2 = vldFirstDig2 % 11;
			if (aux2 == 10) {
				aux2 = 0;
			}
		
			//System.out.println(aux2);
			//System.out.println("");
		
				
			int c = Integer.parseInt(cpfReplace.valueOf(cpfReplace.charAt(9)));
			int d = Integer.parseInt(cpfReplace.valueOf(cpfReplace.charAt(10)));
			//System.out.println(c);
			//System.out.println(d);
				
			if(aux == c && aux2 == d ) {				
				System.out.println("CPF verdadeiro!");	
				resposta = true;
				return resposta;
			}else {				
				resposta = false;
									
				//System.out.println("CPF falso!" );	
				throw new Exception("CPF invalido");
			}	
			//return resposta;			
		}
	}
}