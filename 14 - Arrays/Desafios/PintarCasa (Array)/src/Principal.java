import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		Casa c = new Casa();
		
		System.out.print("Cor: ");
		String cor = sc.next();
		c.pinta(cor);
		System.out.println(c.getCor());
		
		for (int i = 0; i < 3; i++) {
			Porta p = new Porta();
			c.adicionaPorta(p);			
		}
		
		
		
	}
}
