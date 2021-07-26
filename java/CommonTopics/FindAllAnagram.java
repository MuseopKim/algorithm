package CommonTopics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindAllAnagram {

    static int solution(String source, String target) {
        int count = 0;
        Map<Character, Integer> sourceMap = new HashMap<>();
        Map<Character, Integer> targetMap = new HashMap<>();

        for (char character : target.toCharArray()) {
            targetMap.put(character, targetMap.getOrDefault(character, 0) + 1);
        }

        int length = target.length() - 1;

        for (int i = 0; i < length; i++) {
            sourceMap.put(source.charAt(i), sourceMap.getOrDefault(source.charAt(i), 0) + 1);
        }

        int left = 0;

        for (int right = length; right < source.length(); right++) {
            sourceMap.put(source.charAt(right), sourceMap.getOrDefault(source.charAt(right), 0) + 1);

            if (sourceMap.equals(targetMap)) {
                count += 1;
            }

            sourceMap.put(source.charAt(left), sourceMap.getOrDefault(source.charAt(left), 0) - 1);

            if (sourceMap.get(source.charAt(left)) == 0) {
                sourceMap.remove(source.charAt(left));
            }

            left += 1;
        }

        return count;
    }

    static int findCountOfAnagram(String str, String target) {
        char[] charArray = str.toCharArray();
        Map<Character, Integer> characterMap = new HashMap<>();
        Map<Character, Integer> targetMap = new HashMap<>();

        for (char character : target.toCharArray()) {
            targetMap.put(character, targetMap.getOrDefault(character, 0) + 1);
        }

        for (int i = 0; i < target.length() - 1; i++) {
            characterMap.put(charArray[i], characterMap.getOrDefault(charArray[i], 0) + 1);
        }

        int count = 0;
        int left = 0;

        for (int right = target.length() - 1; right < charArray.length; right++) {
            boolean isAnagram = true;

            characterMap.put(charArray[right], characterMap.getOrDefault(charArray[right], 0) + 1);

            for (Map.Entry<Character, Integer> entry : characterMap.entrySet()) {
                if (!targetMap.containsKey(entry.getKey())) {
                    isAnagram = false;
                    break;
                }

                if (targetMap.get(entry.getKey()) != entry.getValue()) {
                    isAnagram = false;
                    break;
                }
            }

            if (isAnagram) {
                count += 1;
            }

            characterMap.put(charArray[left], characterMap.get(charArray[left]) - 1);

            if (characterMap.get(charArray[left]) == 0) {
                characterMap.remove(charArray[left]);
            }

            left += 1;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String str = stdIn.next();
        String target = stdIn.next();

        System.out.println(findCountOfAnagram(str, target));
    }
}
