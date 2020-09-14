public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int cible;
        int max;
        // game loop
        while (true) {
            cible = 0;
            max = 0;
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain.
                if (max < mountainH) {
                    cible = i;
                    max = mountainH;
                }
            }
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            System.out.println(cible); // The index of the mountain to fire on.
            // reset
            cible = 0;
            max = 0;
        }
    }
}