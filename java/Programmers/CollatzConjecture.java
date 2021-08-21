package Programmers;

import java.util.Scanner;

public class CollatzConjecture {

    static boolean isEvenNumber(long number) {
        return number % 2 == 0;
    }

    static  int solution(int num) {
        int answer = 0;
        long inputNumber = num;

        while (answer < 500) {
            if (inputNumber == 1) {
                return answer;
            }

            if (isEvenNumber(inputNumber)) {
                inputNumber /= 2;
            } else {
                inputNumber = (inputNumber * 3) + 1;
            }

            answer += 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int number = stdIn.nextInt();
        System.out.println(solution(number));
    }
}
