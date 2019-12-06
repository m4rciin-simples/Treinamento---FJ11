import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.printf("1 - Solteiro(a) " +
                "\n2 - Desquitado(a) " +
                "\n3 - Casado(a) " +
                "\n4 - Divorciado(a) " +
                "\n5 - Viuvo(a) \n");

        System.out.println("Digite o numero que corresponde ao seu estado civil: ");
        int estadoCivil = Integer.parseInt(sc.next());

        switch (estadoCivil){
            case 1:
                System.out.println("1 - Solteiro(a)");
                break;
            case 2:
                System.out.println("2 - Desquitado(a)");
                break;
            case 3:
                System.out.println("3 - Casado(a)");
                break;
            case 4:
                System.out.println("4 - Divorciado(a)");
                break;
            case 5:
                System.out.println("5 - Viuvo(a)");
                break;
            default:
                System.out.println("Digite uma opcao valida!");
        }
    }

}
