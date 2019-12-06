import java.util.Scanner;

public class teste {
	
	static int  fazAniversario(int idade ) {	
		Scanner sc = new Scanner(System.in);		
		System.out.print("Quantidade de aniversarios a serem somados: "); 	
		int qtdNiver = sc.nextInt();
		idade = idade + qtdNiver;
		return idade;
	}	
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);	
	
		System.out.print("Qual o seu nome: ");
		String nome = sc.next();
		System.out.print("Qual a sua idade: "); 
		int idade = Integer.parseInt(sc.next());
		
		System.out.print("Aniversarios completos: " + fazAniversario(idade));
	}
}	