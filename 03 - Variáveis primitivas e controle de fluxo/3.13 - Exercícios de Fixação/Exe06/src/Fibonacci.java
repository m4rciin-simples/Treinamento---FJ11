public class Fibonacci {

    public static long fibonacci(int n) {
        return n < 2 ? n : fibonacci(n - 2) + fibonacci(n - 1);
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 12; i++) {
            System.out.println("Fibonacci(" + i + ") = " + fibonacci(i));
        }
    }
}
