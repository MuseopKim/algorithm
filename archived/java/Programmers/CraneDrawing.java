package Programmers;

import java.util.Stack;

public class CraneDrawing {

    static int solution(int[][] board, int[] moves) {
        Stack<Integer> basket = new Stack<>();
        int length = board.length;
        int[] location = new int[length];

        for (int column = 0; column < length; column++) {
            for (int row = 0; row < length; row++) {
                if (board[row][column] == 0) {
                    location[column] += 1;
                }
            }
        }

        int count = 0;

        for (int i = 0; i < moves.length; i++) {
            int column = moves[i] - 1;
            int row = location[column];

            if (row >= length) {
                continue;
            }

            int doll = board[row][column];

            if (doll == 0) {
                continue;
            }

            location[column] += 1;

            if (basket.isEmpty()) {
                basket.push(doll);
                continue;
            }

            if (basket.peek() == doll) {
                basket.pop();
                count += 2;
            } else {
                basket.push(doll);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}},
                                    new int[]{1, 5, 3, 5, 1, 2, 1, 4}));
    }
}
