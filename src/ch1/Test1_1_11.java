package ch1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Test1_1_11 {
    public static void main(String[] args) {
        int N = 10, M = 10;
        boolean[][] twoDementionalArray = new boolean[N][M];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                twoDementionalArray[i][j] = StdRandom.bernoulli();

        StdOut.println("  0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < N; i++) {
            StdOut.printf("%1$d ", i);
            for (int j = 0; j < M; j++)
                if (twoDementionalArray[i][j]) StdOut.print("* ");
                else StdOut.print("  ");
            StdOut.println();
        }

    }
}
