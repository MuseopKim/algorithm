package CommonTopics;

import java.util.Scanner;

public class CoordinateAlignment {

    static int[][] arrange(int rowCount, int[][] lines) {
        int x = 0;
        int y = 1;

        for (int i = 0; i < rowCount; i++) {
            for (int j = i + 1; j < rowCount; j++) {
                if (lines[i][x] > lines[j][x]) {
                    int[] temp = lines[i];
                    lines[i] = lines[j];
                    lines[j] = temp;
                }

                if (lines[i][x] == lines[j][x]) {
                    if (lines[i][y] > lines[j][y]) {
                        int[] temp = lines[i];
                        lines[i] = lines[j];
                        lines[j] = temp;
                    }
                }
            }
        }

        return lines;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int rowCount = stdIn.nextInt();
        int columnCount = 2;
        int[][] lines = new int[rowCount][columnCount];

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                lines[i][j] = stdIn.nextInt();
            }
        }

        for (int[] alignment : arrange(rowCount, lines)) {
            System.out.println(alignment[0] + " " + alignment[1]);
        }
    }
}
