package Programmers;

import java.util.ArrayList;
import java.util.List;

public class SecretMap {

    static String binaryNumber(int number, String binary) {
        if (number < 2) {
            return binary + number;
        }

        int mod = number % 2;
        String str = binaryNumber(number / 2, binary);
        return mod + str;
    }

    static String[] solution(int n, int[] arr1, int[] arr2) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = arr1[i];
            int b = arr2[i];

            int[] lineA = new int[n];
            int[] lineB = new int[n];

            String binaryA = binaryNumber(a, "");
            int indexA = n - 1;
            for (char character : binaryA.toCharArray()) {
                if (character == '1') {
                    lineA[indexA] = 1;
                }

                indexA -= 1;
            }

            String binaryB = binaryNumber(b, "");
            int indexB = n - 1;
            for (char character : binaryB.toCharArray()) {
                if (character == '1') {
                    lineA[indexB] = 1;
                }

                indexB -= 1;
            }

            StringBuilder strBuilder = new StringBuilder();

            for (int j = 0; j < n; j++) {
                if (lineA[j] == 1 || lineB[j] == 1) {
                    strBuilder.append("#");
                } else {
                    strBuilder.append(" ");
                }
            }

            list.add(strBuilder.toString());
        }

        return list.toArray(String[]::new);
    }

    public static void main(String[] args) {
        System.out.println(solution(5, new int[] { 9, 20, 28, 18, 11 }, new int[] { 30, 1, 21, 17, 28 }));
    }
}
