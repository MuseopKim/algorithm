package CommonTopics;

import java.util.Scanner;

public class RecursionBasic {

    static void print(int number) {
        if (number == 0) {
            return;
        }

        print(number - 1);
        System.out.print(number + " ");
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int max = stdIn.nextInt();

        print(max);
    }
}
