package CommonTopics;

import java.util.Scanner;

public class BinarySearch {

    static void merge(int[] numbers, int begin, int middle, int end) {
        int current = begin;
        int[] data = new int[numbers.length];

        int firstGroupIndex = begin;
        int secondGroupIndex = middle + 1;

        while (firstGroupIndex <= middle && secondGroupIndex <= end) {
            if (numbers[firstGroupIndex] < numbers[secondGroupIndex]) {
                data[current] = numbers[firstGroupIndex];
                firstGroupIndex++;
                current++;
            } else {
                data[current] = numbers[secondGroupIndex];
                secondGroupIndex++;
                current++;
            }
        }

        while (firstGroupIndex <= middle) {
            data[current] = numbers[firstGroupIndex];
            firstGroupIndex++;
            current++;
        }

        while (secondGroupIndex <= end) {
            data[current] = numbers[secondGroupIndex];
            secondGroupIndex++;
            current++;
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

    static int binarySearch(int[] numbers, int begin, int end, int target) {
        if (begin > end) {
            return -1;
        }

        int middle = (begin + end) / 2;

        if (numbers[middle] == target) {
            return middle;
        }

        if (numbers[middle] > target) {
            return binarySearch(numbers, begin, middle - 1, target);
        } else {
            return binarySearch(numbers, middle + 1, end, target);
        }
    }

    static int findIndex(int length, int[] numbers, int target) {
        int begin = 0;
        int end = length - 1;

        mergeSort(numbers, begin, end);

        int index = binarySearch(numbers, begin, end, target);
        return index + 1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int length = stdIn.nextInt();
        int[] numbers = new int[length];

        int target = stdIn.nextInt();

        for (int i = 0; i < length; i++) {
            numbers[i] = stdIn.nextInt();
        }

        System.out.println(findIndex(length, numbers, target));
    }
}
