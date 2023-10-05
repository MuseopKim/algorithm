package CommonTopics;

import java.util.Scanner;

public class Factorial {

    static int factorial(int number) {
        if (number == 1) {
            return 1;
        }

        return number * factorial(number - 1);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int number = stdIn.nextInt();

        System.out.println(factorial(number));
    }
}
