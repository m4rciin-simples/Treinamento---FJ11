import java.util.Scanner;

public class Praia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int inserir = 1;
        int contador = 0;
        double media = 0;
        int cont = 0;

        while (inserir != 2) {

            double aux = 0;
            String aux2 = "";

            System.out.print("Nome da praia: ");
            String praia = sc.next();
            System.out.print("Distancia da praia em KM: ");
            double distancia = Double.parseDouble(sc.next());

            contador++;
            media = media + distancia;

            if (distancia > 10 && distancia < 15) {
                cont++;
            }
            if(aux < distancia){
                aux = distancia;
                aux2 = praia;
            }

            System.out.println("Inserir nova praia? (1-Sim / 2-Nao)? ");
            int continua = Integer.parseInt(sc.next());

            if (continua == 2) {
                inserir = 2;
                System.out.println("Quantidade de praias com mais de 10KM e menos de 15 KM de distancia: " + cont);
                System.out.println("A distancia media das praias inseridas eh de: " + (media / contador));
                praia = "zzz";
                System.out.println("Praia: " + praia);
                System.out.println("Distancia: " + distancia);
                System.out.println("Praia mais distante eh: " + aux2 + " Com distancia de: " + aux);
            }
            if (continua == 1) {
                System.out.println("Praia: " + praia);
                System.out.println("Distancica: " + distancia);

            }

        }


    }
}
