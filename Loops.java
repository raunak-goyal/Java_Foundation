public class Loops {

    public static void main(String[] args) {

        // ---------- FOR LOOP ----------
        System.out.println("For Loop Output:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        // ---------- WHILE LOOP ----------
        System.out.println("While Loop Output:");
        int j = 1;
        while (j <= 5) {
            System.out.print(j + " ");
            j++;
        }

        System.out.println("\n");

        // ---------- DO-WHILE LOOP ----------
        System.out.println("Do-While Loop Output:");
        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 5);

        System.out.println("\n");

        // ---------- PATTERN PRINTING ----------
        System.out.println("Star Pattern:");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
