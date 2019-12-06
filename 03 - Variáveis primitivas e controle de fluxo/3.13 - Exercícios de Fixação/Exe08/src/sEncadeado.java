public class sEncadeado {
    public static void main(String[] args) {
        int n;

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++){
                n = i * j;
                System.out.print(n + " ");
            }
            System.out.println("");
        }
    }
}
