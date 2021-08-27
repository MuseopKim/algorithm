package CommonTopics;

import java.util.*;

public class ShortestDistanceGraph {

    static int n;
    static int m;
    static int[] check;
    static int[] distance;
    static List<ArrayList<Integer>> graph;

    static void BFS(int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);

        while (!queue.isEmpty()) {
            int length = queue.size();

            for (int j = 0; j < length; j++) {
                int current = queue.poll();
                List<Integer> list = graph.get(current);

                for (int number : list) {
                    if (check[number] == 0) {
                        check[number] = 1;
                        distance[number] = distance[current] + 1;
                        queue.offer(number);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        n = stdIn.nextInt();
        m = stdIn.nextInt();

        check = new int[n + 1];
        distance = new int[n + 1];
        graph = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = stdIn.nextInt();
            int b = stdIn.nextInt();

            graph.get(a).add(b);
        }

        BFS(1);

        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + distance[i]);
        }
    }
}
