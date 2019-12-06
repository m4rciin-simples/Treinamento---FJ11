import java.util.Scanner;

public class Energia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salMinimo = 724;
        double kW;
        double kWMes;

        kW = (salMinimo/7)/100;

        System.out.print("Qual o consumo em KW no mes: ");
        kWMes = Double.parseDouble(sc.next());
        System.out.printf("\nConsumo mensal em R$: %.2f", kWMes * kW);
        System.out.printf("\nCada KW custa: %.2f", kW);
        System.out.printf("\nPagamento com desconto: %.2f", (kWMes * kW) * 0.9);


    }
}
