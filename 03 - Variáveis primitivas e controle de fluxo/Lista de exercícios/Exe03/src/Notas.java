import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double notaA = Double.parseDouble(sc.next());
        System.out.print("Digite a segunda nota: ");
        double notaB = Double.parseDouble(sc.next());
        System.out.print("Digite a terceira nota: ");
        double notaC = Double.parseDouble(sc.next());

        if(notaA > 0 && notaA < 11 && notaB > 0 && notaB < 11 && notaC > 0 && notaC <11){
            double media = (notaA + notaB + notaC) / 3;
            if(media >= 6){
                System.out.println("Aprovado!");
            }if (media < 4){
                System.out.println("Reprovado!");
            }if (media < 6 && media >=4){
                System.out.println("Deve fazer a prova final!");
            }
        }else {
            System.out.println("Digite valores validos!");
        }

        sc.close();
    }
}
