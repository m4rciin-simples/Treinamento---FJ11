import java.sql.SQLOutput;
import java.util.Scanner;

public class ConjuntoPessoas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double aux = 0;
        int contM = 0;
        int contF = 0;
        int somaF = 0;
        double mediaM = 0;

        boolean continua = true;
        while (continua) {

            System.out.println("");
            System.out.print("Digite o numero de identificação: ");
            int id = Integer.parseInt(sc.next());

            if (id != 999) {
                System.out.print("Insira o sexo (1-Masc / 2-Fem): ");
                String sexo = sc.next();
                System.out.print("Digite a idade: ");
                int idade = Integer.parseInt(sc.next());

                aux = aux + idade;



                switch (sexo) {
                    case "1":
                        sexo = "Masc";
                        contM++;
                        System.out.println("Numero: " + id);
                        System.out.println("Sexo: " + sexo);
                        System.out.println("Idade: " + idade);
                        mediaM = aux / contM;
                        break;
                    case "2":
                        sexo = "Fem";
                        contF++;
                        somaF = somaF + idade;
                        System.out.println("Numero: " + id);
                        System.out.println("Sexo: " + sexo);
                        System.out.println("Idade: " + idade);
                        break;
                    default:
                        System.out.println("Digite um valor valido.");
                }

            }
            if (id == 999) {
                continua = false;
            } else {

            }

        }

        System.out.println("Media de idade dos homens: " + mediaM);
        System.out.println("A soma das idades das mulheres eh: " + somaF);
        if (contM > contF) {
            System.out.println("Há mais homens que mulheres. Total: " + contM);
        } if(contM == contF) {
            System.out.println("Há  a mesma quantidade de homens e mulheres. ");
        }else{
            System.out.println("Há mais mulheres que homens. Total: " + contF);
        }

    }
}
