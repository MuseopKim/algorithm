package CommonTopics;

import java.util.Scanner;

public class DecideInterimLeader {

    static int solution(int n, int[][] array) {
        int result = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int count = 0;

            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (array[i][k] == array[j][k]) {
                        count++;
                        break;
                    }
                }
            }

            if (count > max) {
                max = count;
                result = i;
            }
        }

        return result;
    }

    static int decideInterimLeader(int[][] classrooms) {
        int lineCount = classrooms.length;

        int[] counts = new int[lineCount];

        for (int i = 1; i < lineCount; i++) {
            int count = 0;

            for (int j = 1; j < 6; j++) {
                int classroom = classrooms[i][j];

                for (int k = 1; k < lineCount; k++) {
                    if (k == i) {
                        continue;
                    }

                    if (classroom == classrooms[k][j]) {
                        count += 1;
                    }
                }
            }

            counts[i] = count;
        }

        int maximumCount = counts[1];
        int leader = 1;

        for (int i = 2; i < counts.length; i++) {
            if (counts[i] > maximumCount) {
                maximumCount = counts[i];
                leader = i;
            }
        }

        return leader;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int count = stdIn.nextInt();
        int[][] classrooms = new int[count + 1][6];

        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= 5; j++) {
                classrooms[i][j] = stdIn.nextInt();
            }
        }

        int leader = solution(count, classrooms);

        System.out.println(leader);
    }
}
