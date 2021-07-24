package CommonTopics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {

    static String distinguishAnagram(String firstWord, String secondWord) {
        Map<Character, Integer> characterMap = new HashMap<>();

        for (char character: firstWord.toCharArray()) {
            characterMap.put(character, characterMap.getOrDefault(character, 0) + 1);
        }

        for (char character: secondWord.toCharArray()) {
            if (!characterMap.containsKey(character)) {
                return "NO";
            }

            if (characterMap.get(character) == 0) {
                return "NO";
            }

            characterMap.put(character, characterMap.get(character) - 1);
        }

        return "YES";
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String firstWord = stdIn.next();
        String secondWord = stdIn.next();

        System.out.println(distinguishAnagram(firstWord, secondWord));
    }
}
