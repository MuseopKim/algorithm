package CommonTopics;

import java.util.Scanner;

public class NumberOfCombinations {

    static int[][] combinations = new int[35][35];

    private static int combination(int n, int r) {
        if (combinations[n][r] > 0) {
            return combinations[n][r];
        }

        if (n == r || r == 0) {
            return 1;
        }

        combinations[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);

        return combinations[n][r];
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int r = stdIn.nextInt();

        System.out.println(combination(n, r));
    }
}
