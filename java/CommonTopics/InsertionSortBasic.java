package CommonTopics;

import java.util.Scanner;

public class InsertionSortBasic {

    static int[] arrangeAscByInsertionSort(int count, int[] numbers) {
        for (int i = 1; i < count; i++) {
            int temp = numbers[i];
            int j;

            for (j = i - 1; j >= 0; j--) {
                if (numbers[j] > temp) {
                    numbers[j + 1] = numbers[j];
                }

                if (numbers[j] <= temp) {
                    break;
                }
            }

            numbers[j + 1] = temp;
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

        for (int number : arrangeAscByInsertionSort(count, numbers)) {
            System.out.print(number + " ");
        }
    }
}
