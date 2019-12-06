import java.util.Scanner;

public class PlanoSaude {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um nome: ");
        String nome = sc.next();
        System.out.print("Digite a idade: ");
        int idade = Integer.parseInt(sc.next());

        if(idade > 0 && idade < 100){
            if(idade <= 10){
                System.out.println("R$ 30,00");
            }if(idade > 10 && idade <= 29){
                System.out.println("R$ 60,00");
            }if(idade > 29 && idade <= 45){
                System.out.println("R$ 120,00");
            }if(idade > 45 && idade <= 59){
                System.out.println("R$ 150,00");
            }if(idade > 59 && idade <= 65){
                System.out.println("R$ 250,00");
            }if(idade > 65){
                System.out.println("R$ 400,00");
            }
        }
    }
}
