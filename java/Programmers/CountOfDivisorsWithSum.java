package Programmers;

import java.util.HashSet;
import java.util.Set;

public class CountOfDivisorsWithSum {

    static int countDivisors(int number) {
        Set<Integer> divisors = new HashSet<>();

        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                divisors.add(i);
                divisors.add(number / i);
            }
        }

        return divisors.size();
    }

    static int solution(int left, int right) {
        int result = 0;

        for (int i = left; i <= right; i++) {
            int count = countDivisors(i);

            if (count % 2 == 0) {
                result += i;
            } else {
                result -= i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution(13, 17));
    }
}
