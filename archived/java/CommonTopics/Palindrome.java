package CommonTopics;

import java.util.Scanner;

public class Palindrome {

    static String solution(String str) {
        String answer = "YES";
        str = str.toUpperCase();

        // i < length / 2 : 길이로 나눈 몫 전까지 반복
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                answer = "NO";
                break;
            }
        }

        return answer;
    }

    static String isPalindrome(String target) {
        target = target.toUpperCase();

        int left = 0;
        int right = target.length() - 1;

        boolean palindrome = true;

        while (left < right) {
            if (target.charAt(left) != target.charAt(right)) {
                palindrome = false;
                break;
            }

            left += 1;
            right -= 1;
        }

        if (palindrome) {
            return "YES";
        }

        return "NO";
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String input = stdIn.nextLine();
        String result = isPalindrome(input);

        System.out.println(result);
    }
}
