import java.util.Scanner;

public class Programa1 {
	
		
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);	
		Pessoa p = new Pessoa();
	
		System.out.println("Qual o seu nome: ");
		p.nome = sc.next();
		
		System.out.println("Qual a sua idade: "); 
		p.idade = Integer.parseInt(sc.next());
				
		System.out.print("Quantidade de aniversarios a serem somados: "); 
		int qtdNiver = sc.nextInt();
		System.out.println("Aniversarios completos: " + p.fazAniversario(qtdNiver));
	}
}	