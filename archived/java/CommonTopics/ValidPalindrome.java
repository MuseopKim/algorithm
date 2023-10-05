package CommonTopics;

import java.util.Scanner;

public class ValidPalindrome {

    static String isValidPalindrome(String target) {
        target = target.toUpperCase().replaceAll("[^A-Z]", "");

        String reversedTarget = new StringBuilder(target).reverse().toString();

        if (target.equals(reversedTarget)) {
            return "YES";
        }

        return "NO";
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String input = stdIn.nextLine();
        String result = isValidPalindrome(input);

        System.out.println(result);
    }
}
