package CommonTopics;

import java.util.*;

public class SavingPrincess {

    static int findPrince(int count, int number) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < count; i++) {
            queue.offer(i + 1);
        }

        while (queue.size() != 1) {
            for (int i = 0; i < number - 1; i++) {
                int current = queue.poll();
                queue.offer(current);
            }

            queue.poll();
        }

        return queue.poll();
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int count = stdIn.nextInt();
        int number = stdIn.nextInt();

        System.out.println(findPrince(count, number));
    }
}
