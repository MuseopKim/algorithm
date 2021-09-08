package CommonTopics;

import java.util.Scanner;

public class FindingTheHighestScore {

    static int result = 0;
    static int timeLimit = 0;

    static void findHighestScore(int level, int sum, int totalTime, int[] score, int[] time) {
        if (totalTime > timeLimit) {
            return;
        }

        if (level == score.length) {
            result = Math.max(result, sum);
            return;
        }

        findHighestScore(level + 1, sum + score[level], totalTime + time[level], score, time);
        findHighestScore(level + 1, sum, totalTime, score, time);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int count = stdIn.nextInt();
        int[] score = new int[count];
        int[] time = new int[count];

        timeLimit = stdIn.nextInt();

        for (int i = 0; i < count; i++) {
            score[i] = stdIn.nextInt();
            time[i] = stdIn.nextInt();
        }

        findHighestScore(0, 0, 0, score, time);

        System.out.println(result);
    }
}
