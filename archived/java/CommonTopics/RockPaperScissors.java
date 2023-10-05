package CommonTopics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RockPaperScissors {

    static List<String> runGame(int round, int[] personA, int[] personB) {
        String A = "A";
        String B = "B";
        String DRAW = "D";

        List<String> results = new ArrayList<>();

        for (int i = 0; i < round; i++) {
            int a = personA[i];
            int b = personB[i];
            int result = Math.abs(a - b);

            if (result == 2) {
                if (a > b) {
                    results.add(B);
                    continue;
                }

                results.add(A);
                continue;
            }

            if (result == 0) {
                results.add(DRAW);
                continue;
            }

            if (a > b) {
                results.add(A);
                continue;
            }

            if (a < b) {
                results.add(B);
            }
        }

        return results;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int round = stdIn.nextInt();
        int[] personA = new int[round];
        int[] personB = new int[round];

        for (int i = 0; i < round; i++) {
            personA[i] = stdIn.nextInt();
        }

        for (int i = 0; i < round; i++) {
            personB[i] = stdIn.nextInt();
        }

        for (String result : runGame(round, personA, personB)) {
            System.out.println(result);
        }
    }
}
