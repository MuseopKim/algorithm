package CommonTopics;

import java.util.Scanner;

public class MaximumRevenue {

    static int calculateMaximumRevenue(int days, int range, int[] revenue) {
        int sum = 0;

        for (int i = 0; i < range; i++) {
            sum += revenue[i];
        }

        int maxSum = sum;

        for (int i = range; i < days; i++) {
            sum += revenue[i];
            sum -= revenue[i - range];

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int days = stdIn.nextInt();
        int range = stdIn.nextInt();

        int[] revenue = new int[days];

        for (int i = 0; i < days; i++) {
            revenue[i] = stdIn.nextInt();
        }

        System.out.println(calculateMaximumRevenue(days, range, revenue));
    }
}
