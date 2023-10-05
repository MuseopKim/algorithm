package CommonTopics;

import java.util.Scanner;

public class SubsetWithSameSum {

    static String result = "NO";
    static int total = 0;
    static boolean finish = false;

    static void DFS(int level, int sum, int[] numbers, int maxLength) {
        if (finish) {
            return;
        }

        if (level == maxLength) {
            if ((total - sum == sum)) {
                result = "YES";
                finish = true;
            }

            return;
        }

        DFS(level, sum + numbers[level], numbers, maxLength);
        DFS(level, sum, numbers, maxLength);
    }

    static void getSubset(int level, int[] numbers, boolean[] visit, int maxLength) {
        if (finish) {
           return;
        }

        if (level == maxLength) {
            int sum = 0;

            for (int i = 0; i < maxLength; i++) {
                if (visit[i]) {
                    sum += numbers[i];
                }
            }

            if (total - sum == sum) {
                result = "YES";
                finish = true;
            }

            return;
        }

        visit[level] = true;
        getSubset(level + 1, numbers, visit, maxLength);
        visit[level] = false;
        getSubset(level + 1, numbers, visit, maxLength);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int maxLength = stdIn.nextInt();
        int[] numbers = new int[maxLength];

        for (int i = 0; i < maxLength; i++) {
            numbers[i] = stdIn.nextInt();
            total += numbers[i];
        }

        boolean[] visit = new boolean[maxLength];

        getSubset(0, numbers, visit, maxLength);

        System.out.println(result);
    }
}
