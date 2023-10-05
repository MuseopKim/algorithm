package CommonTopics;

import java.util.Arrays;
import java.util.Scanner;

public class ChooseStables {

    static int count(int[] stables, int distance) {
        int endPoint = 0;
        int totalCount = 1;

        for (int i = 1; i < stables.length; i++) {
            if (stables[i] - stables[endPoint] >= distance) {
                totalCount += 1;
                endPoint = i;
            }
        }

        return totalCount;
    }

    static int findMaximumLength(int stableCount, int[] stables, int horseCount) {
        Arrays.sort(stables);

        int left = stables[1] - stables[0];
        int right = stables[stableCount - 1] - stables[0];

        int result = 0;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (count(stables, middle) >= horseCount) {
                result = middle;
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int stableCount = stdIn.nextInt();
        int[] stables = new int[stableCount];

        int horseCount = stdIn.nextInt();

        for (int i = 0; i < stableCount; i++) {
            stables[i] = stdIn.nextInt();
        }

        System.out.println(findMaximumLength(stableCount, stables, horseCount));
    }
}
