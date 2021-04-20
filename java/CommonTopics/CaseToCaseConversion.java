package CommonTopics;

import java.util.Scanner;

public class CaseToCaseConversion {

    static String converse(String target) {
        StringBuilder strBuilder = new StringBuilder();

        for (char character : target.toCharArray()) {
            if (Character.isLowerCase(character)) {
                strBuilder.append(Character.toUpperCase(character));
                continue;
            }

            strBuilder.append(Character.toLowerCase(character));
        }
        return strBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String target = stdIn.nextLine();
        System.out.println(converse(target));
    }

    // 아스키 넘버 활용
    static String asciiConverse(String target) {
        StringBuilder strBuilder = new StringBuilder();

        for (char character : target.toCharArray()) {
            // 대문자 65 ~ 90
            // 소문자 97 ~ 122
            if (character >= 65 && character <= 90) {
                strBuilder.append((char) (character + 32));
                continue;
            }
            strBuilder.append((char) (character - 32));
        }

        return strBuilder.toString();
    }
}
