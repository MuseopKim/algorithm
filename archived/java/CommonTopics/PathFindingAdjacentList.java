package CommonTopics;

import java.util.ArrayList;
import java.util.Scanner;

public class PathFindingAdjacentList {

    static int n;
    static int m;
    static int count;
    static int[] check;
    static ArrayList<ArrayList<Integer>> graph;

    static void DFS(int number) {
        if (number == n) {
            count += 1;
            return;
        }

        for (int k : graph.get(number)) {
            if (check[k] == 0) {
                check[k] = 1;
                DFS(k);
                check[k] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        n = stdIn.nextInt();
        m = stdIn.nextInt();

        check = new int[n + 1];
        graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = stdIn.nextInt();
            int b = stdIn.nextInt();

            graph.get(a).add(b);
        }

        check[1] = 1;
        DFS(1);
        System.out.println(count);
    }
}
