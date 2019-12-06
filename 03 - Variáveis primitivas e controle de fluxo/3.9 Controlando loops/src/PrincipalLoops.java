public class PrincipalLoops {

    public static void main(String[] args) {
        int x = 0;
        int y = 30;
        for (int i = x; i < y; i++) {
            if (i % 19 == 0) {
                System.out.println("\nAchei um número divisível por 19 entre x e y ");
                break;
            }
        }

        System.out.println("\n\n");

        for (int i = 0; i < 100; i++) {
            if (i > 50 && i < 60) {
                continue;
            }
            System.out.print(i + " ");
        }

        System.out.println("\n\n");

        int i;
        for (i = 0; i < 10; i++) {
            System.out.println("olá!");
        }
        System.out.println(i);

    }
}