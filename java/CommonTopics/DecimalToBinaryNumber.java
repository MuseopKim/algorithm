package CommonTopics;

import java.util.Scanner;

public class DecimalToBinaryNumber {

    static void convertToBinaryNumber(int decimalNumber) {
        if (decimalNumber == 1) {
            System.out.print(decimalNumber);
            return;
        }

        convertToBinaryNumber(decimalNumber / 2);
        System.out.print(decimalNumber % 2);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int decimalNumber = stdIn.nextInt();

        convertToBinaryNumber(decimalNumber);
    }
}
