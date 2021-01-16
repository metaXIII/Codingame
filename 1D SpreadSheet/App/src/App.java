import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    private static String[][] sheets;
    private static Integer[] res;

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);   
        int N = in.nextInt();
        sheets = new String[N][3];
        res = new Integer[N];
        for (int i = 0; i < N; i++) {
            String operation = in.next();
            String arg1 = in.next();
            String arg2 = in.next();
            sheets[i] = new String[]{operation, arg1, arg2};
        }
        for (int i = 0; i < N; i++) {
            System.out.println(getResult(i));
        }
    }

	private static int getResult(int i) {
        if (res[i] != null) {
            return res[i];
        }

        String arg1 = sheets[i][1];
        String arg2 = sheets[i][2];
        int val1 = arg1.charAt(0) == '$' ? getResult(Integer.parseInt(arg1.substring(1))) : Integer.parseInt(arg1);
        int val2 = arg2.equals("_") ? 0 : arg2.charAt(0) == '$' ? getResult(Integer.parseInt(arg2.substring(1))) : Integer.parseInt(arg2);
        switch (sheets[i][0]) {
            case "VALUE":
            res[i] = val1;
            break;
            case "ADD":
            res[i] = val1 + val2;
            break;
            case "SUB":
            res[i] = val1 - val2;
            break;
            case "MULT":
            res[i] = val1 * val2;
            break;
            default:
            break;
        }
        return res[i];    
	}
}