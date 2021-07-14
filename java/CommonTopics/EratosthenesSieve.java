package CommonTopics;

import java.util.Scanner;

public class EratosthenesSieve {

    static int primeNumberCount(int maxNumber) {
        int[] numbers = new int[maxNumber + 1];
        int count = 0;

        for (int i = 2; i <= maxNumber; i++) {
            if (numbers[i] == 0) {
                count += 1;

                for (int j = i; j <= maxNumber; j += i) {
                    numbers[j] = 1;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int maxNumber = stdIn.nextInt();
        int count = primeNumberCount(maxNumber);

        System.out.println(count);
    }
}
