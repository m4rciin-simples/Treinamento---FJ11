import java.util.Scanner;

public class Locadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a quantidade de videos disponiveis: ");
        double qtdVideos = Double.parseDouble(sc.next());;
        System.out.print("Valor por locacao: ");
        double preco = Double.parseDouble(sc.next());


        double totalAlugado = qtdVideos/3;
        System.out.printf("Total Alugado por mes: %.2f", totalAlugado);
        double fatMensal = totalAlugado * preco;
        System.out.printf("\nFaturamento mensal: %.2f", fatMensal);
        double fatAnual = fatMensal * 12;
        System.out.printf("\nFaturamento Anual: %.2f", fatAnual);
        double multas = (totalAlugado/10) * (preco * 0.1);
        System.out.printf("\nArrecadacao mensal com multas: %.2f", multas);
        double perdas = qtdVideos * 0.02;
        System.out.printf("\nPerdas no ano: ", perdas);
        double reposicao = qtdVideos/10;
        System.out.println("Reposicao no ano: " + reposicao);
        double fechamentoAnual = qtdVideos - perdas + reposicao;
        System.out.println("Quantidade de videos ao final de um ano: " + fechamentoAnual);


        sc.close();

    }
}
