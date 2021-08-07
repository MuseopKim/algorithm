package CommonTopics;

import java.util.Scanner;

public class MergeSortBasic {

    static void merge(int[] numbers, int begin, int middle, int end) {
        int firstGroupIndex = begin;
        int secondGroupIndex = middle + 1;

        int[] data = new int[numbers.length];
        int currentIndex = begin;

        while (firstGroupIndex <= middle && secondGroupIndex <= end) {
            if (numbers[firstGroupIndex] <= numbers[secondGroupIndex]) {
                data[currentIndex++] = numbers[firstGroupIndex++];
            } else {
                data[currentIndex++] = numbers[secondGroupIndex++];
            }
        }

        while (firstGroupIndex <= middle) {
            data[currentIndex++] = numbers[firstGroupIndex++];
        }

        while (secondGroupIndex <= end) {
            data[currentIndex++] = numbers[secondGroupIndex++];
        }

        for (int i = begin; i <= end; i++) {
            numbers[i] = data[i];
        }
    }

    static void mergeSort(int[] numbers, int begin, int end) {
        if (begin < end) {
            int middle = (begin + end) / 2;
            mergeSort(numbers, begin, middle);
            mergeSort(numbers, middle + 1, end);
            merge(numbers, begin, middle, end);
        }
    }

    static int[] arrangeAscByMergeSort(int length, int[] numbers) {
        int begin = 0;
        int end = length - 1;

        mergeSort(numbers, begin, end);

        return numbers;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int length = stdIn.nextInt();
        int[] numbers = new int[length];

        for (int i = 0; i < length; i++) {
            numbers[i] = stdIn.nextInt();
        }

        for (int number : arrangeAscByMergeSort(length, numbers)) {
            System.out.print(number + " ");
        }
    }
}
