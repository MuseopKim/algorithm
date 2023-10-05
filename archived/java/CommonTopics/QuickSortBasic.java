package CommonTopics;

import java.util.Scanner;

public class QuickSortBasic {

    static int partition(int[] numbers, int begin, int end) {
        int pivot = numbers[end];
        int lowerGroupIndex = begin - 1;

        for (int i = begin; i < end; i++) {
            if (numbers[i] <= pivot) {
                lowerGroupIndex += 1;
                int temp = numbers[lowerGroupIndex];
                numbers[lowerGroupIndex] = numbers[i];
                numbers[i] = temp;
            }
        }

        int pivotIndex = lowerGroupIndex + 1;
        int temp = numbers[pivotIndex];
        numbers[pivotIndex] = numbers[end];
        numbers[end] = temp;

        return pivotIndex;
    }

    static void quickSort(int[] numbers, int begin, int end) {
        if (begin < end) {
            int pivotIndex = partition(numbers, begin, end);
            quickSort(numbers, begin, pivotIndex - 1);
            quickSort(numbers, pivotIndex + 1, end);
        }
    }

    static int[] arrangeAscByQuickSort(int count, int[] numbers) {
        quickSort(numbers, 0, count - 1);

        return numbers;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int count = stdIn.nextInt();
        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            numbers[i] = stdIn.nextInt();
        }

        for (int number : arrangeAscByQuickSort(count, numbers)) {
            System.out.print(number + " ");
        }
    }
}
