import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int H = in.nextInt();
        StringBuilder solution = new StringBuilder();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String T = in.nextLine();
        String[] ROW = new String[H];
        for (int i = 0; i < H; i++) {
            ROW[i] = in.nextLine();
        }
        T = T.toUpperCase();
        
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < T.length(); j++) {
                char character = T.charAt(j);
                if ((int) character < 65 || (int) character > 90)
                    character = '?';
                int position = character != '?' ? (int) character - 65 : (int) character - 37;
                solution.append(ROW[i].substring(position * L , (position * L) + L));
            }
            solution.append("\n");
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        
        System.out.println(solution.toString());
    }
}