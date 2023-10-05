package CommonTopics;

import java.util.Scanner;
import java.util.Stack;

public class PostFixCalculation {

    static int calculate(String source) {
        Stack<Integer> numbers = new Stack<>();

        for (char character : source.toCharArray()) {
            if (Character.isDigit(character)) {
                Integer number = Character.getNumericValue(character);
                numbers.add(number);
                continue;
            }

            int a = numbers.pop();
            int b = numbers.pop();

            if (character == '+') {
                numbers.push(b + a);
            }

            if (character == '-') {
                numbers.push(b - a);
            }

            if (character == '*') {
                numbers.push(b * a);
            }

            if (character == '/') {
                numbers.push(b / a);
            }
        }

        return numbers.pop();
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String source = stdIn.next();

        System.out.println(calculate(source));
    }
}
