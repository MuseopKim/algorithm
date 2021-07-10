package CommonTopics;

import java.util.Scanner;

public class CompressionOfString {

    static String compress(String target) {
        StringBuilder compressedString = new StringBuilder();

        char[] characters = target.toCharArray();

        char currentCharacter = characters[0];
        int count = 1;

        compressedString.append(currentCharacter);

        for (int i = 1; i < characters.length; i++) {
            if (characters[i] == currentCharacter) {
                if (i == characters.length - 1) {
                    count += 1;
                    compressedString.append(count);
                    continue;
                }
                count += 1;
                continue;
            }

            if (count == 1) {
                currentCharacter = characters[i];
                compressedString.append(currentCharacter);
                continue;
            }

            compressedString.append(count);
            currentCharacter = characters[i];
            compressedString.append(currentCharacter);
            count = 1;
        }

        return compressedString.toString();
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String input = stdIn.next();
        String result = compress(input);

        System.out.println(result);
    }
}
