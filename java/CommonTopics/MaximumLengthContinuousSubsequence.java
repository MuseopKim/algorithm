package CommonTopics;

import java.util.Scanner;

public class MaximumLengthContinuousSubsequence {

    static int findMaximumLength(int length, int[] numbers, int countOfZero) {
        int maxLength = 0;
        int count = 0;
        int left = 0;

        for (int right = 0; right < length; right++) {
            if (numbers[right] == 0) {
                count += 1;
            }

            while (count > countOfZero) {
                if (numbers[left] == 0) {
                    count -= 1;
                }

                left += 1;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int length = stdIn.nextInt();
        int[] numbers = new int[length];

        int countOfZero = stdIn.nextInt();

        for (int i = 0; i < length; i++) {
            numbers[i] = stdIn.nextInt();
        }

        System.out.println(findMaximumLength(length, numbers, countOfZero));
    }
}
