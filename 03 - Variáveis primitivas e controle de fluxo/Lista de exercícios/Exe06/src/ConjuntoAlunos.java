import java.util.Scanner;

public class ConjuntoAlunos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double matricula = 0;

        while (matricula != 999) {

            System.out.println("");
            System.out.print("Digite a matricula do aluno: ");
            matricula = Double.parseDouble(sc.next());

            if (matricula != 999) {
                System.out.print("Digite a primeira nota: ");
                double notaA = Double.parseDouble(sc.next());
                System.out.print("Digite a segunda nota: ");
                double notaB = Double.parseDouble(sc.next());
                System.out.print("Digite a terceira nota: ");
                double notaC = Double.parseDouble(sc.next());

                if (notaA > 0 && notaA < 11 && notaB > 0 && notaB < 11 && notaC > 0 && notaC < 11) {
                    double media = (notaA + notaB + notaC) / 3;
                    if (media >= 6) {
                        System.out.println("Aprovado!");
                    }
                    if (media < 4) {
                        System.out.println("Reprovado!");
                    }
                    if (media < 6 && media >= 4) {
                        System.out.println("Deve fazer a prova final!");
                    }
                } else {
                    System.out.println("Digite valores validos!");
                }

            }else {
                System.out.println("Fim da insercao do conjunto!");
            }

        }

        sc.close();
    }
}

