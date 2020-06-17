package powerofthor;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in        = new Scanner(System.in);
        int     lightX    = in.nextInt(); // the X position of the light of power
        int     lightY    = in.nextInt(); // the Y position of the light of power
        int     initialTx = in.nextInt(); // Thor's starting X position
        int     initialTy = in.nextInt(); // Thor's starting Y position

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this
            // line.
            String result = "";
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            if (lightY > initialTy) {
                result = result.concat("S");
                initialTy++;
            } else if (initialTy > lightY) {
                result = result.concat("N");
                initialTy--;
            }
            if (lightX > initialTx) {
                result = result.concat("E");
                initialTx--;
            } else if (initialTx > lightX) {
                result = result.concat("W");
                initialTx++;
            }
            System.out.println(result);
        }
        // A single line providing the move to be made: N NE E SE S SW W or NW
    }
}
