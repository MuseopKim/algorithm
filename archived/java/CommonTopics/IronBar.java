package CommonTopics;

import java.util.Scanner;
import java.util.Stack;

public class IronBar {

    static int splitIronBar(String source) {
        int count = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < source.length(); i++) {
            if (source.charAt(i) == '(') {
                stack.push(source.charAt(i));
            }

            if (source.charAt(i) == ')') {
                stack.pop();

                if (source.charAt(i - 1) == '(') {
                    count += stack.size();
                }

                if (source.charAt(i - 1) == ')') {
                    count += 1;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String source = stdIn.next();

        System.out.println(splitIronBar(source));
    }
}
