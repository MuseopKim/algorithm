package CommonTopics;

import java.util.*;

public class LeastRecentlyUsed {

    static int findIndex(int[] cache, int target) {
        for (int i = 0; i < cache.length; i++) {
            if (cache[i] == target) {
                return i;
            }
        }

        return -1;
    }

    static int[] arrangeCache(int size, int[] cache, int actionCount, int[] actions) {
        for (int i = 0; i < actionCount; i++) {
            int index = findIndex(cache, actions[i]);
            boolean containsAction = index != -1;

            if (containsAction) {
                for (int j = index - 1; j >= 0; j--) {
                    cache[j + 1] = cache[j];
                }
            } else {
                for (int j = size - 2; j >= 0; j--) {
                    cache[j + 1] = cache[j];
                }
            }

            cache[0] = actions[i];
        }

        return cache;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int size = stdIn.nextInt();
        int[] cache = new int[size];

        int actionCount = stdIn.nextInt();
        int[] actions = new int[actionCount];

        for (int i = 0; i < actionCount; i++) {
            actions[i] = stdIn.nextInt();
        }

        for (int action : arrangeCache(size, cache, actionCount, actions)) {
            System.out.print(action + " ");
        }
    }
}
