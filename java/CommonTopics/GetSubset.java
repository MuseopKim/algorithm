package CommonTopics;

import java.util.Scanner;

public class GetSubset {

    static void getSubset(int level, int[] check, int n) {
        if (level == n + 1) {
            for (int i = 1; i <= n; i++) {
                if (check[i] == 1) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            return;
        }

        check[level] = 1;
        getSubset(level + 1, check, n);
        check[level] = 0;
        getSubset(level + 1, check, n);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int[] check = new int[n + 1];

        getSubset(1, check, n);
    }
}
