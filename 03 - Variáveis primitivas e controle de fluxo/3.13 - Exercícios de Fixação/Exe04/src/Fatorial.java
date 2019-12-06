public class Fatorial {

    public static void main(String[] args) {
        long fat = 1;
        for (long i = 1; i < 31; i++) {
            fat = i * fat;
            System.out.print("Fatorial de " + i + "!: " + fat + "\n");
        }
    }
}
