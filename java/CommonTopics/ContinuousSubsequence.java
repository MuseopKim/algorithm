package CommonTopics;

import java.util.Scanner;

public class ContinuousSubsequence {

    static int findCountOfTarget(int length, int[] numbers, int target) {
        int count = 0;

        for (int i = 0; i < length; i++) {
            int sum = 0;

            for (int j = i; j < length; j++) {
                sum += numbers[j];

                if (sum > target) {
                    break;
                }

                if (sum == target) {
                    count += 1;
                    break;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int length = stdIn.nextInt();
        int[] numbers = new int[length];

        int target = stdIn.nextInt();

        for (int i = 0; i < length; i++) {
            numbers[i] = stdIn.nextInt();
        }

        System.out.println(findCountOfTarget(length, numbers, target));
    }
}
