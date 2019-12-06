public class SomaUmAMil {

    public static void main(String[] args) {

        int i = 1;
        int aux = 0;
        while(i < 1001){
            aux += i;
            i++;
        }
        System.out.println("A soma de 1 ate 1000 eh: " + aux);
    }
}
