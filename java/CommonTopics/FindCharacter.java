package CommonTopics;

import java.util.Scanner;

public class FindCharacter {

    static int findCharacter(String str, char target) {
        str = str.toUpperCase();
        target = Character.toUpperCase(target);
        int count = 0;

        for (char character : str.toCharArray()) {
            if (character == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String str = stdIn.nextLine();
        char target = stdIn.nextLine().charAt(0);

        System.out.println(findCharacter(str, target));
    }
}
