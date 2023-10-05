package CommonTopics;

import java.util.Scanner;
import java.util.Stack;

public class CraneDrawing {

    static int countVanished(int[][] lines, int[] rowIndex, int lineCount, int[] moves, int moveCount) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for (int i = 0; i < moveCount; i++) {
            int column = moves[i] - 1;
            int row = rowIndex[column];

            if (row >= lineCount) {
                continue;
            }

            int current = lines[row][column];
            rowIndex[column] += 1;

            if (!stack.isEmpty() && stack.peek() == current) {
                count += 1;

                while (stack.peek() == current) {
                    stack.pop();
                    count += 1;
                }

                continue;
            }

            stack.push(current);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int lineCount = stdIn.nextInt();
        int[][] lines = new int[lineCount][lineCount];
        int[] rowIndex = new int[lineCount];

        for (int i = 0; i < lineCount; i++) {
            for (int j = 0; j < lineCount; j++) {
                lines[i][j] = stdIn.nextInt();

                if (lines[i][j] == 0) {
                    rowIndex[j] += 1;
                }
            }
        }

        int moveCount = stdIn.nextInt();
        int[] moves = new int[moveCount];

        for (int i = 0; i < moveCount; i++) {
            moves[i] = stdIn.nextInt();
        }

        System.out.println(countVanished(lines, rowIndex, lineCount, moves, moveCount));
    }
}
