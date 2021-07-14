package CommonTopics;

import java.util.Scanner;

public class FindRankings {

    static int[] findRankings(int[] scores) {
        int[] rankings = new int[scores.length];

        for (int i = 0; i < scores.length; i++) {
            rankings[i] = 1;

            for (int j = 0; j < scores.length; j++) {
                if (scores[i] < scores[j]) {
                    rankings[i] += 1;
                }
            }
        }

        return rankings;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int count = stdIn.nextInt();
        int[] scores = new int[count];

        for (int i = 0; i < count; i++) {
            scores[i] = stdIn.nextInt();
        }

        int[] rankings = findRankings(scores);

        for (int ranking : rankings) {
            System.out.print(ranking + " ");
        }
    }
}
