package CommonTopics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class RemoveParenthesisCharacters {

    static List<Character> removeParenthesisCharacters(String source) {
        List<Character> result = new ArrayList<>();
        Stack<Character> stack = new Stack<>();

        for (char character : source.toCharArray()) {
            if (character == ')') {
                while (stack.pop() != '(');

                continue;
            }

            stack.push(character);
        }

        for (int i = 0; i < stack.size(); i++) {
            result.add(stack.get(i));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String source = stdIn.next();

        for (char character: removeParenthesisCharacters(source)) {
            System.out.print(character);
        }
    }
}
