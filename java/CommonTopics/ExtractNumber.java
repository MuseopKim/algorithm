package CommonTopics;

import java.util.Scanner;

public class ExtractNumber {

    static int solution(String str) {
        int answer = 0;

        for (char x : str.toCharArray()) {
            if (x >= 48 && x <= 57) {
                answer = answer * 10 + (x - 48);
            }
        }

        return answer;
    }

    static int extractNumber(String target) {
        StringBuilder number = new StringBuilder();

        for (int i = 0; i < target.length(); i++) {
            if (Character.isDigit(target.charAt(i))) {
                number.append(target.charAt(i));
            }
        }
        return Integer.parseInt(number.toString());
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String input = stdIn.nextLine();
        int number = extractNumber(input);

        System.out.println(number);
    }
}
