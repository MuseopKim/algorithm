package Programmers;

import java.util.Arrays;

public class MutualEvaluation {

    static String decideGrade(int score) {
        if (score >= 90) {
            return "A";
        }

        if (score >= 80) {
            return "B";
        }

        if (score >= 70) {
            return "C";
        }

        if (score >= 50) {
            return "D";
        }

        return "F";
    }

    static String solution(int[][] scores) {
        int length = scores.length;
        StringBuilder answerBuilder = new StringBuilder();

        for (int column = 0; column < length; column++) {
            int[] estimates = new int[length];
            int sum = 0;
            int averageLength = length;

            for (int row = 0; row < length; row++) {
                estimates[row] = scores[row][column];
                sum += scores[row][column];
            }

            int selfScore = scores[column][column];

            Arrays.sort(estimates);
            int lowestIndex = 0;
            int secondLowestIndex = 1;
            int highestIndex = length - 1;
            int secondHighestIndex = length - 2;

            if (estimates[lowestIndex] == selfScore) {
                if (estimates[secondLowestIndex] != selfScore) {
                    sum -= selfScore;
                    averageLength -= 1;
                }
            } else if (estimates[highestIndex] == selfScore) {
                if (estimates[secondHighestIndex] != selfScore) {
                    sum -= selfScore;
                    averageLength -= 1;
                }
            }

            String grade = decideGrade(sum / averageLength);
            answerBuilder.append(grade);
        }

        return answerBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{100, 90, 98, 88, 65}, {50, 45, 99, 85, 77}, {47, 88, 95, 80, 67},
                                                {61, 57, 100, 80, 65}, {24, 90, 94, 75, 65}}));
    }
}
