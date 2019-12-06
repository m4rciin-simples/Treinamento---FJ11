import java.util.Scanner;

public class AlienNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite seu alien valor: ");
		String valorEntrada = sc.next();
		System.out.print("Insira a linguagem do seu alien valor: ");
		String lingEntrada = sc.next();
		System.out.print("Qual a linguagem alien destino?  ");
		String lingDestino = sc.next();
		String a = ""; 
		String b = ""; 
		
		int vIni = 0;
		int qtdEntrada = valorEntrada.length();
		int baseEntrada = lingEntrada.length();
		int baseSaida = lingDestino.length();

		for (int i = 0; i < qtdEntrada; i++) {
			
			// Recebe o valor da string individualmente
			String entrada = "" + valorEntrada.charAt(i);
			
			// Pega o valor da String: "entrada" e busca o indice de referencia na lingEntrada
			int e = lingEntrada.indexOf(entrada);

			// Transforma o indice recebido em decimal
			int decimal = (int) (e * Math.pow(10, qtdEntrada - (i + 1)));
			
			//Concatena o resultado para ser apresentado após o fim do laço 
			a = a + e;
			
			
			//Imprime o indice recebido do valor de entrada, referenciado na linguagem de origem e imprime seu resultado em decimal
			System.out.println("Valor decimal: " + decimal);
			
			//Recebe a base destino e compara com a origem 
			//O resultado dessa comparação indicará divisão ou multiplicação por uma base maior ou menor que a decimal 
			
			
			//Considerando bases iguais
			//Pega valor de saída e simplesmente busca o caracter na lista destino(lingDestino) 
			String saida = "" + lingDestino.charAt(e);	
			
			//int indDestino = lingDestino.indexOf(saida);
			
			//Concatena o resultado para ser apresentado após o fim do laço 
			b = b + saida;
			System.out.println("Indice destino: " + saida);
			
				


			System.out.println("Índice: " + e);
			System.out.println();
			
		}
		System.out.println();
		System.out.println(" Origem: " + a + " Destino: " + b);
		
		sc.close();
	}
}
