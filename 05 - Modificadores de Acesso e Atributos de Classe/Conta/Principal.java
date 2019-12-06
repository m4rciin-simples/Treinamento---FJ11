import java.util.Scanner;

class Principal {
	
	public static void main (String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);		
		
		
			Conta c1 = new Conta();	
			System.out.print("Digite o CPF: ");
			c1.setCpf(sc.next());
							
			c1.setTitular("Maria");
			c1.deposita(5000);
			//c1.setIdentificador(1);	
			System.out.println("\nConta 01: " + c1.recuperaDados());
			System.out.println("");			
			
			Conta c2 = new Conta();
			System.out.print("Digite o CPF: ");
			c2.setCpf(sc.next());
						
			c2.setTitular("Joao");
			c2.deposita(2500);
			//c2.setIdentificador(2);
		
			c1.transfere(c1, 1500);
		
			if(c1.saca(200)) {
				System.out.println("Consegui sacar");	
			} else {
				System.out.println("Não consegui sacar");
			}
			
			c1.saca(300);		
			System.out.println("\nConta 01: " + c1.recuperaDados());
			System.out.println("");
			System.out.println("\nConta 02: " + c2.recuperaDados());			
			
	}
}