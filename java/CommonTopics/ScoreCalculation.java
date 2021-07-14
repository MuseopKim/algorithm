package CommonTopics;

import java.util.Scanner;

public class ScoreCalculation {

    static int calculate(int[] scores) {
        int point = 1;
        int totalScore = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == 1) {
                totalScore += point;
                point += 1;
                continue;
            }

            point = 1;
        }

        return totalScore;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int count = stdIn.nextInt();
        int[] scores = new int[count];

        for (int i = 0; i < count; i++) {
            scores[i] = stdIn.nextInt();
        }

        int totalScore = calculate(scores);

        System.out.println(totalScore);
    }
}
