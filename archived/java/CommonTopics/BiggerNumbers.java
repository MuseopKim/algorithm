package CommonTopics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BiggerNumbers {

    static List<Integer> solution(int count, int[] numbers) {
        List<Integer> result = new ArrayList<>();
        result.add(numbers[0]);

        for (int i = 1; i < count; i++) {
            if (numbers[i] > numbers[i - 1]) {
                result.add(numbers[i]);
            }
        }

        return result;
    }

    static String findBiggerNumbers(String target) {
        String[] strNumbers = target.split(" ");
        int[] numbers = new int[strNumbers.length];

        for (int i = 0; i < strNumbers.length; i++) {
            numbers[i] = Integer.parseInt(strNumbers[i]);
        }

        StringBuilder result = new StringBuilder("" + numbers[0]);
        int previousNumber = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > previousNumber) {
                result.append(" ")
                      .append(numbers[i]);
            }
            previousNumber = numbers[i];
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int count = stdIn.nextInt();
        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            numbers[i] = stdIn.nextInt();
        }

        for (int number : solution(count, numbers)) {
            System.out.print(number + " ");
        }
    }
}
