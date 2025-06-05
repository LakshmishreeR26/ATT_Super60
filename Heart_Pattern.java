public class Pattern {
    public static void main(String[] args) {
        System.out.println("Forward Heart:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 && j % 3 != 0 ||
                        i == 1 && j % 3 == 0 ||
                        i - j == 2 || i + j == 8) {
                    System.out.print(" * ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
        System.out.println("Reverse Heart:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 5 && j % 3 != 0 ||
                        i == 4 && j % 3 == 0 ||
                        i + j == 3 || i - j == -3) {
                    System.out.print(" * ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}

