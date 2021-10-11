package CommonTopics;

import java.util.Scanner;

public class GuessSequence {

    static int[][] combinations;
    static int n;
    static int target;
    static int[] counts;
    static int[] numbers;
    static boolean[] check;
    static boolean finished;

    static int combination(int n, int r) {
        if (combinations[n][r] > 0) {
            return combinations[n][r];
        }

        if (n == r || r == 0) {
            return 1;
        }

        combinations[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);

        return combinations[n][r];
    }

    static void DFS(int level, int sum) {
        if (finished) {
            return;
        }

        if (level == n) {
            if (sum == target) {
                for (int number : numbers) {
                    System.out.print(number + " ");
                    finished = true;
                }
            }

            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!check[i]) {
                check[i] = true;
                numbers[level] = i;
                DFS(level + 1, sum + (counts[level] * numbers[level]));
                check[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        n = stdIn.nextInt();
        combinations = new int[n][n];
        check = new boolean[n];

        target = stdIn.nextInt();
        counts = new int[n];
        numbers = new int[n];

        check = new boolean[n + 1];

        for (int i = 0; i < n; i++) {
            counts[i] = combination(n - 1, i);
        }

        DFS(0, 0);
    }
}
