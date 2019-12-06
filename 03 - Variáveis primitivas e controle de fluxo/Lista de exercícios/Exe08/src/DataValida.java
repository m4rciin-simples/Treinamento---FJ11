import java.util.Scanner;

public class DataValida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dia: ");
        int dia = Integer.parseInt(sc.next());
        System.out.print("Mes: ");
        int mes = Integer.parseInt(sc.next());
        System.out.print("Ano: ");
        int ano = Integer.parseInt(sc.next());

        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            if(dia > 0 && dia <= 31){
                if(ano > 1500 && ano < 2020 ){
                    System.out.println("A data eh valida!");
                }else{
                    System.out.println("Ano invalido!");
                }
            }else{
                System.out.println("Dia invalido!");
            }

        }if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
            if(dia > 0 && dia <= 30){
                if(ano > 0000 && ano < 2020 ){
                    System.out.println("A data eh valida!");
                }else{
                    System.out.println("Ano invalido!");
                }
            }else{
                System.out.println("Dia invalido!");
            }

        }if(mes == 2){
            if(dia > 0 && dia <= 29){
                if(ano > 0000 && ano < 2020 ){
                    System.out.println("A data eh valida!");
                }else{
                    System.out.println("Ano invalido!");
                }
            }else{
                System.out.println("Dia invalido!");
            }

        }if(mes < 1 && mes > 12){
            System.out.println("Mes invalido!");
        }else {
            System.out.println("Data invalida!");
        }

    }
}
