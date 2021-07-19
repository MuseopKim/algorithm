package CommonTopics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommonElements {

    static List<Integer> findCommonElements(int lengthA, int[] arrayA, int lengthB, int[] arrayB) {
        // Array.sort(arrayA)
        for (int j = lengthA - 1; j >= 0; j--) {
            for (int i = 0; i < j; i++) {
                if (arrayA[i + 1] < arrayA[i]) {
                    int tempNumber = arrayA[i + 1];
                    arrayA[i + 1] = arrayA[i];
                    arrayA[i] = tempNumber;
                }
            }
        }

        // Array.sort(arrayB)
        for (int j = lengthB - 1; j >= 0; j--) {
            for (int i = 0; i < j; i++) {
                if (arrayB[i + 1] < arrayB[i]) {
                    int tempNumber = arrayB[i + 1];
                    arrayB[i + 1] = arrayB[i];
                    arrayB[i] = tempNumber;
                }
            }
        }

        List<Integer> commonElements = new ArrayList<>();
        int pointerA = 0;
        int pointerB = 0;

        while (pointerA < lengthA && pointerB < lengthB) {
            if (arrayA[pointerA] == arrayB[pointerB]) {
                commonElements.add(arrayA[pointerA]);
                pointerA += 1;
                pointerB += 1;
            }

            if (arrayA[pointerA] < arrayB[pointerB]) {
                pointerA += 1;
            }

            if (arrayA[pointerA] > arrayB[pointerB]) {
                pointerB += 1;
            }
        }

        return commonElements;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int lengthA = stdIn.nextInt();
        int[] arrayA = new int[lengthA];

        for (int i = 0; i < lengthA; i++) {
            arrayA[i] = stdIn.nextInt();
        }

        int lengthB = stdIn.nextInt();
        int[] arrayB = new int[lengthB];

        for (int i = 0; i < lengthB; i++) {
            arrayB[i] = stdIn.nextInt();
        }

        for (int number : findCommonElements(lengthA, arrayA, lengthB, arrayB)) {
            System.out.print(number + " ");
        }
    }
}
