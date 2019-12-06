import java.util.Scanner;


public class Program2{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Porta p = new Porta();
	
		p.dimensaoX = 1.5;
		p.dimensaoY = 3;
		p.dimensaoZ = 0.4;
		
		System.out.println("Porta de altura: " + p.dimensaoY + "\nLargura: " + 
							p.dimensaoX + "\nEspessura: " + p.dimensaoZ);
		
		p.abre();
		p.fecha();
		
		boolean resposta = true;
		String s = "";
		while(resposta){
			if (resposta){				
				System.out.print("Qual a cor: ");				
				s = s + sc.next();
				
				System.out.println("\nDeseja pintar com mais alguma cor? (S/N) ");
				String resp = sc.next(); 
				if(resp.equals("N") || resp.equals("n")){
					resposta = false;
				}
				p.pinta(s);
			}	
		}
		
		p.estaAberta();
		
	}

}