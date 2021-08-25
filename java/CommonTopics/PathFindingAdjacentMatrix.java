package CommonTopics;

import java.util.Scanner;

public class PathFindingAdjacentMatrix {

    static int n;
    static int m;
    static int count = 0;
    static int[][] graph;
    static int[] check;

    static void DFS(int number) {
        if (number == n) {
            count += 1;
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (graph[number][i] == 1 && check[i] == 0) {
                check[i] = 1;
                DFS(i);
                check[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        n = stdIn.nextInt();
        m = stdIn.nextInt();

        graph = new int[n + 1][n + 1];
        check = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int a = stdIn.nextInt();
            int b = stdIn.nextInt();

            graph[a][b] = 1;
        }

        check[1] = 1;

        DFS(1);
        System.out.println(count);
    }
}
