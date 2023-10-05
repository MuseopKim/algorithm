package CommonTopics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseWords {

    static String reverse(String word) {
        char[] characters = word.toCharArray();
        int length = characters.length;

        for (int i = 0; i < length / 2; i++) {
            char temp = characters[i];
            characters[i] = characters[(length - 1) - i];
            characters[(length - 1) - i] = temp;
        }

        return String.valueOf(characters);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int wordCount = Integer.parseInt(stdIn.nextLine());
        List<String> words = new ArrayList<>();

        for (int i = 0; i < wordCount; i++) {
            String word = stdIn.nextLine();
            words.add(word);
        }

        for (String word : words) {
            System.out.println(reverse(word));
        }
    }

    // StringBuilder 활용 문자열 뒤집기
    static List<String> reverseByStringBuilder(String[] words) {
        List<String> reversedWords = new ArrayList<>();

        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            reversedWords.add(reversedWord);
        }

        return reversedWords;
    }

    // 투 포인터
    static List<String> reverseByPointers(String[] words) {
        List<String> reversedWords = new ArrayList<>();

        for (String word : words) {
            char[] characters = word.toCharArray();
            int left = 0;
            int right = characters.length - 1;

            while (left < right) {
                char temp = characters[left];
                characters[left] = characters[right];
                characters[right] = temp;
                left++;
                right--;
            }
            String reversedWord = String.valueOf(characters);
            reversedWords.add(reversedWord);
        }

        return reversedWords;
    }
}
