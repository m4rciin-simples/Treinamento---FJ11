import java.util.Scanner;

public class MaiorNota {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double notaA = Double.parseDouble(sc.next());
        System.out.print("Digite a segunda nota: ");
        double notaB = Double.parseDouble(sc.next());
        System.out.print("Digite a terceira nota: ");
        double notaC = Double.parseDouble(sc.next());

        if(notaA > 0 && notaA < 11 && notaB > 0 && notaB < 11 && notaC > 0 && notaC <11){

            if(notaA > notaB && notaA > notaC){
                System.out.println("Primeira nota é a maior: " + notaA);
            }if(notaB > notaA && notaB > notaC){
                System.out.println("Segunda nota é a maior: " + notaB);
            }if(notaC > notaA && notaC > notaB){
                System.out.println("Terceira nota é a maior: " + notaC);
            }else{
                System.out.println("Podem haver notas iguais!");
            }
        }

        sc.close();
    }
}