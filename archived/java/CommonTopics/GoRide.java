package CommonTopics;

import java.util.Scanner;

public class GoRide {

    static int result = 0;

    static void findMaxWeight(int level, int capacity, int sum, int length, int[] weights) {
        if (sum > capacity) {
            return;
        }

        if (level == length) {
            if (result < sum) {
                result = sum;
            }

            return;
        }

        findMaxWeight(level + 1, capacity, sum + weights[level], length, weights);
        findMaxWeight(level + 1, capacity, sum, length, weights);

    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int capacity = stdIn.nextInt();
        int length = stdIn.nextInt();

        int[] weights = new int[length];

        for (int i = 0; i < length; i++) {
            weights[i] = stdIn.nextInt();
        }

        findMaxWeight(0, capacity, 0, length, weights);

        System.out.println(result);
    }
}
