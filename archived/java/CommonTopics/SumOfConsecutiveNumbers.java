package CommonTopics;

import java.util.Scanner;

public class SumOfConsecutiveNumbers {

    static int findSumOfConsecutiveNumbers(int target) {
        int length = (target / 2) + 1;
        int[] numbers = new int[length];
        int sum = 0;
        int count = 0;
        int left = 0;

        for (int i = 1; i <= length; i++) {
            numbers[i - 1] = i;
        }

        for (int right = 0; right < length; right++) {
            sum += numbers[right];

            if (sum == target) {
                count += 1;
            }

            while (sum >= target) {
                sum -= numbers[left];
                left += 1;

                if (sum == target) {
                    count += 1;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int target = stdIn.nextInt();

        System.out.println(findSumOfConsecutiveNumbers(target));
    }
}
