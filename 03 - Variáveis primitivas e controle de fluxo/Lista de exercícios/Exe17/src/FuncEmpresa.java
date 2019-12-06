import java.util.Scanner;

public class FuncEmpresa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double aux = 0;
        int aux2 = 0;
        int contM = 0;
        int contF = 0;
        double somaSal = 0;
        double mediaG = 0;
        double mediaF = 0;
        double salario = 0;

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
                System.out.print("Valor da hora trabalhada: ");
                double salHora = Double.parseDouble(sc.next());
                System.out.print("Quantidade de horas trabalhadas: ");
                double horasTrab = Double.parseDouble(sc.next());
                salario = horasTrab * salHora;
                somaSal = somaSal + salario;
                mediaG++;

                switch (sexo) {
                    case "1":
                        sexo = "Masc";
                        contM++;
                        System.out.println("Numero: " + id);
                        System.out.println("Sexo: " + sexo);
                        System.out.println("Idade: " + idade);
                        System.out.println("Valor por hora: " + salHora);
                        System.out.println("Horas trabalhadas: " + horasTrab);

                        break;
                    case "2":
                        sexo = "Fem";
                        contF++;
                        if (idade < 30) {
                            aux2++;
                            aux = aux + salario;
                        }
                        mediaF = mediaF + salario;
                        System.out.println("Numero: " + id);
                        System.out.println("Sexo: " + sexo);
                        System.out.println("Idade: " + idade);
                        System.out.println("Valor por hora: " + salHora);
                        System.out.println("Horas trabalhadas: " + horasTrab);

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
        System.out.println("Quantidade de homens: " + contM);
        System.out.println("A media salarial de todas as mulheres equivale a: " + mediaF / contF);
        System.out.println("A media salarial das mulheres com menos de 30 anos eh: " + aux / aux2);
        System.out.println("A media salarial de todos os empregados eh: " + somaSal / mediaG);
    }

}


