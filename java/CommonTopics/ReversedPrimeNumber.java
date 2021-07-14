package CommonTopics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ReversedPrimeNumber {

    static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    static List<Integer> solution(int count, int[] numbers) {
        List<Integer> primeNumbers = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            int tempNumber = numbers[i];
            int reversedNumber = 0;

            while (tempNumber > 0) {
                int remainder = tempNumber % 10;
                reversedNumber = reversedNumber * 10 + remainder;
                tempNumber = tempNumber / 10;
            }

            if (isPrime(reversedNumber)) {
                primeNumbers.add(reversedNumber);
            }
        }

        return primeNumbers;
    }

    static List<Integer> reverse(int count, int[] numbers) {
        List<Integer> primeNumbers = new LinkedList<>();

        for (int i = 0; i < count; i++) {
            int reversedNumber = Integer.parseInt(new StringBuilder(numbers[i] + "").reverse().toString());

            if (reversedNumber == 1) {
                continue;
            }

            boolean prime = true;

            for (int j = 2; j < reversedNumber; j++) {
                if (reversedNumber % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                primeNumbers.add(reversedNumber);
            }
        }

        return primeNumbers;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int count = stdIn.nextInt();
        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            numbers[i] = stdIn.nextInt();
        }

        for (int primeNumber : reverse(count, numbers)) {
            System.out.print(primeNumber + " ");
        }
    }
}
