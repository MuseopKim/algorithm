package CommonTopics;

import java.util.Scanner;
import java.util.Stack;

public class CorrectParentheses {

    static String distinguishByStack(String parentheses) {
        Stack<Character> stack = new Stack<>();

        for (char parenthesis : parentheses.toCharArray()) {
            if (parenthesis == '(') {
                stack.push(parenthesis);
            }

            if (parenthesis == ')') {
                if (stack.isEmpty()) {
                    return "NO";
                }

                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            return "YES";
        }

        return "NO";
    }

    static String distinguishCorrectParentheses(String parentheses) {
        int n = 0;
        boolean correct = true;
        boolean open = true;

        for (char parenthesis : parentheses.toCharArray()) {
            if (n < 0) {
                correct = false;
                break;
            }

            if (parenthesis == '(') {
                open = true;
            }

            if (parenthesis == ')') {
                open = false;
            }

            if (open) {
                n += 1;
            }

            if (!open) {
                n -= 1;
            }
        }

        if (n != 0) {
            correct = false;
        }

        if (correct) {
            return "YES";
        }

        return "NO";
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String parentheses = stdIn.next();

        System.out.println(distinguishCorrectParentheses(parentheses));
    }
}
