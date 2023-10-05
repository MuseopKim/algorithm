package Programmers;

import java.util.*;

public class RemoveSmallestNumber {

        static void merge(int[] numbers, int begin, int middle, int end) {
            int firstGroupIndex = begin;
            int secondGroupIndex = middle + 1;
            int currentIndex = begin;

            int[] data = new int[numbers.length];

            while (firstGroupIndex <= middle && secondGroupIndex <= end) {
                if (numbers[firstGroupIndex] < numbers[secondGroupIndex]) {
                    data[currentIndex] = numbers[firstGroupIndex];
                    firstGroupIndex += 1;
                } else {
                    data[currentIndex] = numbers[secondGroupIndex];
                    secondGroupIndex += 1;
                }

                currentIndex += 1;
            }

            while (firstGroupIndex <= middle) {
                data[currentIndex] = numbers[firstGroupIndex];
                currentIndex += 1;
                firstGroupIndex += 1;
            }

            while (secondGroupIndex <= end) {
                data[currentIndex] = numbers[secondGroupIndex];
                currentIndex += 1;
                secondGroupIndex += 1;
            }

            for (int i = begin; i <= end; i++) {
                numbers[i] = data[i];
            }
        }

        static void mergeSort(int[] numbers, int begin, int end) {
            if (begin >= end) {
                return;
            }

            int middle = (begin + end) / 2;

            mergeSort(numbers, begin, middle);
            mergeSort(numbers, middle + 1, end);
            merge(numbers, begin, middle, end);
        }

        static int[] solution(int[] arr) {
            int length = arr.length;

            if (length == 1) {
                return new int[] { -1 };
            }

            int[] numbers = arr.clone();
            int begin = 0;
            int end = length - 1;
            mergeSort(numbers, begin, end);

            int smallestNumber = numbers[begin];

            List<Integer> list = new LinkedList<>();

            for (int i = 0; i < arr.length; i++) {
                list.add(arr[i]);
            }

            int index = list.indexOf(smallestNumber);
            list.remove(index);

            int[] answer = new int[length - 1];

            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }

            return answer;
        }

    public static void main(String[] args) {
        solution(new int[] { 1, 5, 6, 2, 3, 10, 9 });
    }
}
