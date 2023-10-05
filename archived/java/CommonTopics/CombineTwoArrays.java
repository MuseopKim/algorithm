package CommonTopics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombineTwoArrays {

    static List<Integer> solution(int firstArrayLength, int[] firstArray, int secondArrayLength, int[] secondArray) {
        List<Integer> result = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;

        while (p1 < firstArrayLength && p2 < secondArrayLength) {
            if (firstArray[p1] < secondArray[p2]) {
                result.add(firstArray[p1]);
                p1 += 1;
            } else {
                result.add(secondArray[p2]);
                p2 += 1;
            }
        }

        while (p1 < firstArrayLength) {
            result.add(firstArray[p1]);
            p1 += 1;
        }

        while (p2 < secondArrayLength) {
            result.add(secondArray[p2]);
            p2 += 1;
        }

        return result;
    }

    static int[] combineArrays(int firstArrayLength, int[] firstArray, int secondArrayLength, int[] secondArray) {
        int[] numbers = new int[firstArrayLength + secondArrayLength];

        System.arraycopy(firstArray, 0, numbers, 0, firstArrayLength);
        System.arraycopy(secondArray, 0, numbers, firstArrayLength, secondArrayLength);

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int tempNumber = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tempNumber;
                }
            }
        }

        return numbers;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int firstArrayLength = stdIn.nextInt();
        int[] firstArray = new int[firstArrayLength];

        for (int i = 0; i < firstArrayLength; i++) {
            firstArray[i] = stdIn.nextInt();
        }

        int secondArrayLength = stdIn.nextInt();
        int[] secondArray = new int[secondArrayLength];

        for (int i = 0; i < secondArrayLength; i++) {
            secondArray[i] = stdIn.nextInt();
        }

        for (int number: solution(firstArrayLength, firstArray, secondArrayLength, secondArray)) {
            System.out.print(number + " ");
        }
    }
}
