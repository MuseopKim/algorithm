package Programmers;

import java.util.Scanner;

public class HarshadNumber {

    static boolean isHarshad(int number) {
        String strNumber = String.valueOf(number);

        int sum = 0;

        for (char charNumber : strNumber.toCharArray()) {
            int parsedNumber = Integer.parseInt(String.valueOf(charNumber));
            sum += parsedNumber;
        }

        return number % sum == 0;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int number = stdIn.nextInt();
        System.out.println(isHarshad(number));
    }
}
