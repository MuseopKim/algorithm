package CommonTopics;

import java.util.Scanner;

public class SelectionSortBasic {

    static int[] arrangeAscBySelectionSort(int count, int[] numbers) {
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
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

        for (int number : arrangeAscBySelectionSort(count, numbers)) {
            System.out.print(number + " ");
        }
    }
}
