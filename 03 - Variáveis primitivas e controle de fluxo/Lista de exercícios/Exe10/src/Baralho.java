public class Baralho {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            int carta = (int) (Math.random() * 13) + 1;
            switch (carta) {
                case 1:
                    System.out.println("A");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    System.out.println("5");
                    break;
                case 6:
                    System.out.println("6");
                    break;
                case 7:
                    System.out.println("7");
                    break;
                case 8:
                    System.out.println("8");
                    break;
                case 9:
                    System.out.println("9");
                    break;
                case 10:
                    System.out.println("10");
                    break;
                case 11:
                    System.out.println("Q");
                    break;
                case 12:
                    System.out.println("J");
                    break;
                case 13:
                    System.out.println("K");
                    break;
                default:
                    break;
            }

            int naipe = (int) (Math.random() * 4) + 1;
            switch (naipe) {
                case 1:
                    System.out.println("Ouro");
                    break;
                case 2:
                    System.out.println("Espada");
                    break;
                case 3:
                    System.out.println("Copas");
                    break;
                case 4:
                    System.out.println("Paus");
                    break;
                default:
                    break;
            }

        }
    }
}
