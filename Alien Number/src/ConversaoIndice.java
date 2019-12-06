import java.util.Scanner;

public class ConversaoIndice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com um valor: ");
		String entrada = sc.next();
		int tamEntrada = entrada.length();
		String base = "0123456789";

		int result = 0;
		
		System.out.println("");
		for (int i = 0; i < entrada.length(); i++) {
			// Recebe o valor da String: "entrada" individualmente. Posição por posição
			String recebeValor = "" + entrada.charAt(i);
			
			//Recebe o indice da base que representa o valor de entrada
			int baseIndice= base.indexOf(recebeValor); 
			System.out.println("Base indice: " + baseIndice);
			
			// Transforma o valor recebido da String: "recebeIndice" em um valor Inteiro
			//int valor = Integer.parseInt(recebeValor);
			
			// Calcula os valores
			int calculoDecimal = (int) ((baseIndice) * Math.pow(10, tamEntrada - (i + 1)));

			result = result + calculoDecimal;
			
			System.out.println("String entrada: " + recebeValor);
			System.out.println("Inteiro entrada: " + baseIndice);
			System.out.println("Calculo decimal: " + calculoDecimal);
			System.out.println();

		}
		System.out.println();
		//Imprime a soma dos indices, que deve ser identicos ao valor de entrada
		System.out.println(result);
		
		sc.close();
	}

}
