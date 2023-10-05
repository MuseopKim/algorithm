package Programmers;

public class DartGame {

    static int solution(String dartResult) {
        char[] characters = dartResult.toCharArray();
        int[] scores = new int[3];
        String tempNumber = "";
        int scoreIndex = 0;

        for (int i = 0; i < characters.length; i++) {
            char current = characters[i];

            if (Character.isDigit(current)) {
                tempNumber += current;
            } else if (current == 'S' || current == 'D' || current == 'T') {
                int number = Integer.parseInt(tempNumber);
                tempNumber = "";

                if (current == 'S') {
                    scores[scoreIndex] = (int) Math.pow(number, 1);
                }

                if (current == 'D') {
                    scores[scoreIndex] = (int) Math.pow(number, 2);
                }

                if (current == 'T') {
                    scores[scoreIndex] = (int) Math.pow(number, 3);
                }

                scoreIndex += 1;

            } else {
                if (current == '*') {
                    scores[scoreIndex - 1] *= 2;

                    if (scoreIndex - 2 >= 0) {
                        scores[scoreIndex - 2] *= 2;
                    }
                }

                if (current == '#') {
                    scores[scoreIndex - 1] *= -1;
                }
            }
        }

        return scores[0] + scores[1] + scores[2];
    }

    public static void main(String[] args) {
        System.out.println(solution("1D2S#10S"));
    }
}
