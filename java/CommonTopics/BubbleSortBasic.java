package CommonTopics;

import java.util.Scanner;

public class BubbleSortBasic {

    static int[] arrangeAscByBubbleSort(int count, int[] numbers) {
        for (int i = count; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        return numbers;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int count = stdIn.nextInt();
        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            numbers[i] = stdIn.nextInt();
        }

        for (int number : arrangeAscByBubbleSort(count, numbers)) {
            System.out.print(number + " ");
        }
    }
}
