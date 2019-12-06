import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double salBruto;
        double salLiq;
        System.out.print("Entre com o valor por hora trabalhada: ");
        double vHTrab = Double.parseDouble(sc.next());
        System.out.print("Entre com o valor de horas trabalhadas:  ");
        double hTrab = Double.parseDouble(sc.next());
        System.out.print("Entre com o percentual de desconto(Ex.: 0.05 para 5%): ");
        double descINSS = Double.parseDouble(sc.next());

        salBruto = vHTrab * hTrab;
        salLiq = salBruto - (salBruto * descINSS);

        System.out.println("Salario bruto: " + salBruto);
        System.out.println("Salario liquido: " + salLiq);

        sc.close();

    }
}
