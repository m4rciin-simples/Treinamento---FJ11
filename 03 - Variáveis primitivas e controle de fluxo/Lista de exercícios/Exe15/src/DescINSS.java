import java.util.Scanner;

public class DescINSS {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salario para saber o seu desconto: ");
        double salario = Double.parseDouble(sc.next());

        if(salario > 0){
            if(salario <= 600){
                System.out.print("Isento de desconto.");
            }if(salario > 600 && salario <= 1200){
                System.out.print("Desconto para renda acima de R$600,00 e até R$1200,00: " + salario * 0.2);
            }if(salario > 1200 && salario <= 2000){
                System.out.print("Desconto para renda acima de R$1200,00 e até R$2000,00: " + salario * 0.25);
            }if(salario > 2000){
                System.out.print("Desconto para renda acima de R$2000: " + salario * 0.3);
            }
        }



    }
}
