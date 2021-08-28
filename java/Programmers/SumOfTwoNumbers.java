package Programmers;

import java.util.*;

public class SumOfTwoNumbers {

    static int[] solution(int[] numbers) {
        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] { 2,1,3,4,1 }));
    }
}
