package CommonTopics;

import java.util.Scanner;

public class PermutationOfRepetition {

    static int[] permutation;

    static void DFS(int level, int maximum, int maximumLevel) {
        if (level == maximumLevel) {
            for (int n : permutation)  {
                System.out.print(n + " ");
            }

            System.out.println();
            return;
        }

        for (int i = 1; i <= maximum; i++) {
            permutation[level] = i;
            DFS(level + 1, maximum, maximumLevel);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int maximum = stdIn.nextInt();
        int maximumLevel = stdIn.nextInt();

        permutation = new int[maximumLevel];

        DFS(0, maximum, maximumLevel);
    }
}
