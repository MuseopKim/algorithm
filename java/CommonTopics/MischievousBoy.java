package CommonTopics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MischievousBoy {

    static List<Integer> findBoys(int count, int[] heights) {
        List<Integer> result = new ArrayList<>();

        int[] changedHeights = heights.clone();

        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (changedHeights[i] > changedHeights[j]) {
                    int temp = changedHeights[i];
                    changedHeights[i] = changedHeights[j];
                    changedHeights[j] = temp;
                }
            }
        }

        for (int i = 0; i < count; i++) {
            if (heights[i] != changedHeights[i]) {
                result.add(i + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int count = stdIn.nextInt();
        int[] heights = new int[count];

        for (int i = 0; i < count; i++) {
            heights[i] = stdIn.nextInt();
        }

        for (int index : findBoys(count, heights)) {
            System.out.print(index + " ");
        }
    }
}
