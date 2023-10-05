package CommonTopics;

import java.util.Scanner;

public class Permutation {

    static void permutation(int level, int n, int r, int[] numbers, int[] result, boolean[] visited) {
        if (level == r) {
            for (int number : result) {
                System.out.print(number + " ");
            }

            System.out.println();

            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                result[level] = numbers[i];
                permutation(level + 1, n, r, numbers, result, visited);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        // nPr
        int n = stdIn.nextInt();
        int r = stdIn.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = stdIn.nextInt();
        }

        int[] result = new int[r];
        boolean[] visited = new boolean[n];

        permutation(0, n, r, numbers, result, visited);
    }
}
