package CommonTopics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CoinExchange {

    static int count;
    static Integer[] kind;
    static int change;
    static int result = Integer.MAX_VALUE;

    static void DFS(int level, int sum) {
        if (sum > change) {
            return;
        }

        if (result <= level) {
            return;
        }

        if (sum == change) {
            if (result > level) {
                result = level;
                return;
            }
        }

        for (int i = 0; i < count; i++) {
            DFS(level + 1, sum + kind[i]);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        count = stdIn.nextInt();
        kind = new Integer[count];

        for (int i = 0; i < count; i++) {
            kind[i] = stdIn.nextInt();
        }

        change = stdIn.nextInt();

        Arrays.sort(kind, Collections.reverseOrder());

        DFS(0, 0);

        System.out.println(result);
    }
}
