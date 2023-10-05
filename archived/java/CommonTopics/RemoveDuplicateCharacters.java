package CommonTopics;

import java.util.Scanner;

public class RemoveDuplicateCharacters {

    static String solution(String str) {
        StringBuilder answerBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            // 현재 인덱스와 indexOf로 조회한 인덱스가 같다 == 최초로 등장한 문자
//            System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
            if (str.indexOf(str.charAt(i)) == i) {
                answerBuilder.append(str.charAt(i));
            }
        }

        return answerBuilder.toString();
    }

    static String removeDuplicateCharacters(String target) {
        char[] characters = target.toCharArray();

        for (int i = 0; i < characters.length - 1; i++) {
            for (int j = i + 1; j < characters.length; j++) {
                if (characters[i] == characters[j]) {
                    characters[j] = ' ';
                }
            }
        }

        String removedCharacters = String.valueOf(characters);

        return removedCharacters.replaceAll(" ", "");
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String input = stdIn.next();
        String duplicateRemovedCharacters = removeDuplicateCharacters(input);

        System.out.println(duplicateRemovedCharacters);
    }
}
