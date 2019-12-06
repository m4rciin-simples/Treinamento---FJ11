import java.util.Scanner;
class Programa {
	
	public static void main(String[] Args){
		Scanner sc = new Scanner(System.in);
		

		Conta c1 = new Conta();		
		c1.titular = "Marcio";
		c1.saldo = 1000.0;
		c1.agencia = "45678-9";
		c1.numero = 123;
		
		Data data = new Data();
		c1.dataAbertura = data;
		c1.dataAbertura.dia = 05;
		c1.dataAbertura.mes = 11;
		c1.dataAbertura.ano = 2019;
		
		Conta c2 = new Conta();
		c2.titular = "Marcio";
		c2.saldo = 2000;
		c2.agencia = "12345-8";
		c2.numero = 456;
		Data data2 = new Data();
		c2.dataAbertura = data2;
		c2.dataAbertura.dia = 01;
		c2.dataAbertura.mes = 11;
		c2.dataAbertura.ano = 2019;
		
		/*Conta c3 = new Conta();
		
		if (c2 == c1) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}
		
		if(c1.saca(2000)){
			System.out.println("Consegui sacar");
		}else{
				System.out.println("Não consegui sacar");
		}		
		*/
		c2.transfere(c1, 50);
		
		//System.out.println("Saldo atual: " + c1.saldo);
		
		c1.saca(200);
		
		c1.deposita(5000);
		
		
		System.out.println("\nConta 01: " + c1.recuperaDados());
		System.out.println("\nConta 02: " + c2.recuperaDados());
		
		
	}

}