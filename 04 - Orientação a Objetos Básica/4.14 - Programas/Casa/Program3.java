import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Casa p1 = new Casa();
		Casa p2 = new Casa();
		Casa p3 = new Casa();
		
		int cont = 0;
			
			//Porta numero 1
			System.out.println("Digite a largura: ");
			p1.dimensaoX = Double.parseDouble(sc.next());
			System.out.println("Digite a altura: ");
			p1.dimensaoY = Double.parseDouble(sc.next());
			System.out.println("Digite a espessura: ");
			p1.dimensaoZ = Double.parseDouble(sc.next());
			System.out.println("Porta de altura: " + p1.dimensaoY + 
								"\nLargura: " + p1.dimensaoX + 
								"\nEspessura: " + p1.dimensaoZ);
								
			p1.abre();
			p1.fecha();
			
			String s = "";
						
			System.out.print("Qual a cor: ");				
			s = s + sc.next();
				
			p1.pinta(s);
				
			if (p1.porta1 == true) {
				p1.estaAberta();
				cont++;
			}
			
			//Porta numero 2
			System.out.println("");
			System.out.println("Digite a largura: ");
			p2.dimensaoX = Double.parseDouble(sc.next());
			System.out.println("Digite a altura: ");
			p2.dimensaoY = Double.parseDouble(sc.next());
			System.out.println("Digite a espessura: ");
			p2.dimensaoZ = Double.parseDouble(sc.next());
			System.out.println("Porta de altura: " + p2.dimensaoY + 
								"\nLargura: " + p2.dimensaoX + 
								"\nEspessura: " + p2.dimensaoZ);
								
			p2.abre();
			p2.fecha();
						
			System.out.print("Qual a cor: ");				
			s = s + sc.next();
				
			p2.pinta(s);
				
			if (p2.porta2 == true) {
				p2.estaAberta();
				cont++;
			}
			
			//Porta numero 3
			System.out.println("");
			System.out.println("Digite a largura: ");
			p3.dimensaoX = Double.parseDouble(sc.next());
			System.out.println("Digite a altura: ");
			p3.dimensaoY = Double.parseDouble(sc.next());
			System.out.println("Digite a espessura: ");
			p3.dimensaoZ = Double.parseDouble(sc.next());
			System.out.println("Porta de altura: " + p3.dimensaoY + 
								"\nLargura: " + p3.dimensaoX + 
								"\nEspessura: " + p3.dimensaoZ);
								
			p3.abre();
			p3.fecha();
						
			System.out.print("Qual a cor: ");				
			s = s + sc.next();
				
			p3.pinta(s);
				
			if (p3.porta3 == true) {
				p3.estaAberta();
				cont++;
			}
		
		System.out.println("");
		System.out.println("Portas abertas: " + cont);
			
	}		

}