package CommonTopics;

import java.util.Scanner;

public class Combination {

    static int[] numbers;
    static int n;
    static int r;

    static void combination(int level, int start) {
        if (level == r) {
            for (int number : numbers) {
                System.out.print(number + " ");
            }

            System.out.println();

            return;
        }

        for (int i = start; i <= n; i++) {
            numbers[level] = i;
            combination(level + 1, i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        n = stdIn.nextInt();
        r = stdIn.nextInt();

        numbers = new int[r];

        combination(0, 1);
    }
}
