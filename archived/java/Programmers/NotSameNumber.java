package Programmers;

import java.util.Stack;

public class NotSameNumber {

    static int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty()) {
                stack.push(arr[i]);
                continue;
            }

            if (stack.peek() == arr[i]) {
                continue;
            }

            stack.push(arr[i]);
        }

        int length = stack.size();
        int[] answer = new int[length];

        for (int i = length - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] { 1, 1, 1, 3, 3, 5, 6 }));
    }
}
