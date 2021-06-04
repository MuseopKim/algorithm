package CommonTopics;

import java.util.Scanner;

public class ReverseOnlyAlphabets {

    static String reverseAlphabets(String target) {
        char[] characters = target.toCharArray();
        int left = 0;
        int right = characters.length - 1;

        while (left < right) {
            char upperCasedCharacter = Character.toUpperCase(characters[left]);

            if (upperCasedCharacter >= 65 && upperCasedCharacter <= 90) {
                char tempCharacter = characters[left];
                characters[left] = characters[right];
                characters[right] = tempCharacter;
            }

            left += 1;
            right -= 1;
        }

        return String.valueOf(characters);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String target = stdIn.nextLine();

        String reversedString = reverseAlphabets(target);
        System.out.println(reversedString);
    }
}
