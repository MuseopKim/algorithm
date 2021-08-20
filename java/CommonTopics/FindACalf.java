package CommonTopics;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindACalf {

    static int findACalf(int start, int target) {
        int[] check = new int[10001];
        check[start] = start;
        int[] distances = { 1, -1, 5 };
        int count = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);

        while (!queue.isEmpty()) {
            int length = queue.size();

            for (int i = 0; i < length; i++) {
                int x = queue.poll();

                if (x == target) {
                    return count;
                }


                for (int j = 0; j < distances.length; j++) {
                    int nx = x + distances[j];

                    if (nx >= 1 && nx <= 10000 && check[nx] == 0) {
                        check[nx] = nx;
                        queue.offer(nx);
                    }
                }
            }

            count += 1;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int start = stdIn.nextInt();
        int target = stdIn.nextInt();

        System.out.println(findACalf(start, target));
    }
}
