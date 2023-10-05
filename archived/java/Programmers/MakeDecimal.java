package Programmers;

public class MakeDecimal {

    static boolean isPrimeNumber(int number) {
        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    static int solution(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int number = nums[i] + nums[j] + nums[k];

                    if (isPrimeNumber(number)) {
                        count += 1;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 7, 6, 4 };
        System.out.println(solution(nums));
    }
}
