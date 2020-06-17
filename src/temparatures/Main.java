package temparatures;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in       = new Scanner(System.in);
        int     n        = in.nextInt();// the number of temperatures to analyse
        int     result   = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            result = (Math.abs(t) < Math.abs(result) || t == Math.abs(result)) ? t : result;
        }
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        System.out.println(result != Integer.MAX_VALUE ? result : 0);
    }
}
