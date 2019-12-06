package casa;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Casa c = new Casa();
		
		//Seta cor da casa e imprime a cor
		System.out.print("Cor da casa: ");
		c.setCor(sc.next());
		c.getCor();
		
		//Seta a qtd de portas e imprime 
		System.out.print("Portas da casas: ");
		int qtd = sc.nextInt();
		c.adicionaPorta(new Porta(), qtd);
		System.out.println("Quantidade de portas: " + c.qtdDePortasAbertas());
		
		c.portasAbertas();
	}
	

	
}