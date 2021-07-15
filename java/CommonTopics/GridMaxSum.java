package CommonTopics;

import java.util.Scanner;

public class GridMaxSum {

    static int solution(int count, int[][] lines) {
        int maxValue = Integer.MIN_VALUE;
        int sum1, sum2;

        for (int i = 0; i < count; i++) {
            sum1 = sum2 = 0;

            for (int j = 0; j < count; j++) {
                sum1 += lines[i][j];
                sum2 += lines[j][i];
            }

            maxValue = Math.max(maxValue, sum1);
            maxValue = Math.max(maxValue, sum2);
        }

        sum1 = sum2 = 0;

        for (int i = 0; i < count; i++) {
            sum1 += lines[i][i];
            sum2 += lines[i][count - i - 1];
        }

        maxValue = Math.max(maxValue, sum1);
        maxValue = Math.max(maxValue, sum2);

        return maxValue;
    }

    static int findMaxSum(int[][] lines) {
        int maxSum = 0;

        for (int i = 0; i < lines.length; i++) {
            int sum = 0;

            for (int j = 0; j < lines.length; j++) {
                sum += lines[i][j];
            }

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        for (int j = 0; j < lines.length; j++) {
            int sum = 0;

            for (int i = 0; i < lines.length; i++) {
                sum += lines[i][j];
            }

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        int descCrossSum = 0;

        for (int i = 0; i < lines.length; i++) {
            descCrossSum += lines[i][i];
        }

        if (descCrossSum > maxSum) {
            maxSum = descCrossSum;
        }

        int ascCrossSum = 0;

        for (int i = lines.length - 1; i >= 0; i--) {
            ascCrossSum += lines[i][(lines.length - 1) - i];
        }

        if (ascCrossSum > maxSum) {
            maxSum = ascCrossSum;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int count = stdIn.nextInt();
        int[][] lines = new int[count][count];

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                lines[i][j] = stdIn.nextInt();
            }
        }

        int maxSum = findMaxSum(lines);

        System.out.println(maxSum);
    }
}
