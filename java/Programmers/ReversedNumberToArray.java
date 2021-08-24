package Programmers;

public class ReversedNumberToArray {

    static int[] solution(long n) {
        int length = String.valueOf(n).length();
        int[] answer = new int[length];

        for (int i = 0; i < length; i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(88));
    }
}
