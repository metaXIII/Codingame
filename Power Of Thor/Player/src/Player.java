import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            StringBuilder stringBuilder = new StringBuilder();
            if (lightY - initialTy > 0) {
                stringBuilder.append("S");
                initialTy++;
            }
            if (lightY - initialTy < 0) {
                stringBuilder.append("N");
                initialTy--;
            }
            if (lightX - initialTx > 0) {
                stringBuilder.append("E");
                initialTx--;
            }
            else if  (lightX - initialTx < 0) {
                stringBuilder.append("W");
                initialTx++;
            }
            System.out.println(stringBuilder.toString());
        }
    }
}