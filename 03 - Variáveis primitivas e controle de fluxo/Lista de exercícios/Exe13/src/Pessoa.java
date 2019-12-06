import java.util.Scanner;

public class Pessoa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um nome: ");
        String nome = sc.next();
        System.out.print("Digite a idade: ");
        int idade = Integer.parseInt(sc.next());

        if (idade > 0 && idade < 110){
            if (idade > 65 && idade < 110){
                System.out.println("Maior de idade!");
                System.out.println("Maior de 65 anos!");
            }if(idade < 12){
                System.out.println("Menor de idade!");
            }if(idade >= 12 && idade < 18){
                System.out.println("Menor de idade!");
            }
        }
    }
}
