import java.util.Scanner;

public class Combustivel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double kmLitro = 12;

        System.out.print("Digite o numero de horas: ");
        double horas = Double.parseDouble(sc.next());
        System.out.print("Digite o numero de minutos: ");
        double minutos = Double.parseDouble(sc.next());

        double tempoViagem = (horas*60 + minutos)/60;
        System.out.print("Qual a velocidade media: ");
        double velMedia = Double.parseDouble(sc.next());

        double distancia = tempoViagem * velMedia;
        double litrosUsados = distancia/kmLitro;

        System.out.printf("Quantidade de combustivel necessaria para a viagem eh de: %.2f", litrosUsados, "L");

    }
}
