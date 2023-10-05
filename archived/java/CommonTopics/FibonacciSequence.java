package CommonTopics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciSequence {

    static List<Integer> fibonacciSequence(int count) {
        List<Integer> results = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            if (i == 0 || i == 1) {
                results.add(1);
                continue;
            }

            int result = results.get(i - 2) + results.get(i - 1);
            results.add(result);
        }

        return results;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int count = stdIn.nextInt();

        for (int number: fibonacciSequence(count)) {
            System.out.print(number + " ");
        }
    }
}
