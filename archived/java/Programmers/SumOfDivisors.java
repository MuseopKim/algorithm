package Programmers;

import java.util.HashSet;
import java.util.Set;

public class SumOfDivisors {

    static int solution(int n) {
        Set<Integer> divisors = new HashSet<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                divisors.add(n / i);
            }
        }

        int sum = 0;

        for (int divisor : divisors) {
            sum += divisor;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(solution(16));
    }
}
