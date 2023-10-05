package Programmers;

public class ReverseTernaryNumber {

    static int convertToDecimalNumber(String number) {
        String[] numbers = String.valueOf(number).split("");
        int length = numbers.length;
        int decimalNumber = 0;

        for (int i = 0; i < length; i++) {
            if (Integer.parseInt(numbers[i]) == 0) {
                continue;
            }

            decimalNumber += Math.pow(3, length - 1 - i) * Integer.parseInt(numbers[i]);
        }

        return decimalNumber;
    }

    static String convertToReversedTernaryNumber(int number) {
        StringBuilder ternaryBuilder = new StringBuilder();

        while (number >= 3) {
            ternaryBuilder.append(number % 3);
            number /= 3;
        }

        return ternaryBuilder.append(number).toString();
    }

    static int solution(int n) {
        String reversedTernaryNumber = convertToReversedTernaryNumber(n);
        return convertToDecimalNumber(reversedTernaryNumber);
    }

    public static void main(String[] args) {
        solution(45);
    }
}
