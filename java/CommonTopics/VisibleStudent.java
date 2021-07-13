package CommonTopics;

import java.util.Scanner;

public class VisibleStudent {

    static int visibleStudentCount(int totalCount, int[] heights) {
        int maxHeight = heights[0];
        int count = 1;

        for (int i = 1; i  < totalCount; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                count += 1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int count = stdIn.nextInt();
        int[] heights = new int[count];

        for (int i = 0; i < count; i++) {
            heights[i] = stdIn.nextInt();
        }

        int totalCount = visibleStudentCount(count, heights);

        System.out.println(totalCount);
    }
}
