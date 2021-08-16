package CommonTopics;

import java.util.Scanner;

public class FibonacciByRecursion {

    static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        int nthNumber = fibonacci(n - 2) + fibonacci(n - 1);

        return nthNumber;
    }

    static void printFibonacci(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();

        printFibonacci(n);
    }
}
