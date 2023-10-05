package CommonTopics;

import java.util.Scanner;

public class DuplicateVerification {

    static String verify(int count, int[] numbers) {
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (numbers[i] == numbers[j]) {
                    return "D";
                }
            }
        }

        return "U";
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int count = stdIn.nextInt();
        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            numbers[i] = stdIn.nextInt();
        }

        System.out.println(verify(count, numbers));
    }
}
