package ch1;

import edu.princeton.cs.algs4.StdOut;

public class Test1_1_14 {
    public static void main(String[] args) {
        StdOut.println("10: " + lg(10) + " " + Math.log(10) / Math.log(2));
        StdOut.println("11: " + lg(11) + " " + Math.log(11) / Math.log(2));
        StdOut.println("12: " + lg(12) + " " + Math.log(12) / Math.log(2));
        StdOut.println("13: " + lg(13) + " " + Math.log(13) / Math.log(2));
        StdOut.println("14: " + lg(14) + " " + Math.log(14) / Math.log(2));
        StdOut.println("15: " + lg(15) + " " + Math.log(15) / Math.log(2));
        StdOut.println("16: " + lg(16) + " " + Math.log(16) / Math.log(2));
        StdOut.println("17: " + lg(17) + " " + Math.log(17) / Math.log(2));
        StdOut.println("18: " + lg(18) + " " + Math.log(18) / Math.log(2));
        StdOut.println("19: " + lg(19) + " " + Math.log(19) / Math.log(2));
        StdOut.println();
        StdOut.println("10: " + lg(10) + " " + Math.log(10) / Math.log(2));
        StdOut.println("11: " + lg(11) + " " + Math.log(11) / Math.log(2));
        StdOut.println("12: " + lg(12) + " " + Math.log(12) / Math.log(2));
        StdOut.println("13: " + lg(13) + " " + Math.log(13) / Math.log(2));
        StdOut.println("14: " + lg(14) + " " + Math.log(14) / Math.log(2));
        StdOut.println("15: " + lg(15) + " " + Math.log(15) / Math.log(2));
        StdOut.println("16: " + lg(16) + " " + Math.log(16) / Math.log(2));
        StdOut.println("17: " + lg(17) + " " + Math.log(17) / Math.log(2));
        StdOut.println("18: " + lg(18) + " " + Math.log(18) / Math.log(2));
        StdOut.println("19: " + lg(19) + " " + Math.log(19) / Math.log(2));
    }

    static int lg(int n) {
        int result = 1;
        for (int i = 1; i < n; i++) {
            result *= 2;
            if (result > n) return i - 1;
            else if (result == n) return i;
        }
        return -1;
    }

    static int lg2(int n) {

        int logInt = 0;

        while (n > 0) {
            logInt++;

            n /= 2;
        }

        return logInt - 1;
    }
}
