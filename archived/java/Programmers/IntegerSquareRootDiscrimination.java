package Programmers;

public class IntegerSquareRootDiscrimination {

    static long discriminate(long begin, long end, long target) {
        if (begin > end) {
            return -1;
        }

        long middle = (begin + end) / 2;

        if (Math.pow(middle, 2) == target) {
            return (middle + 1) * (middle + 1);
        }

        if (Math.pow(middle, 2) > target) {
            return discriminate(begin, middle - 1, target);
        }

        return discriminate(middle + 1, end, target);
    }

    static long solution(long n) {
        return discriminate(1, n, n);
    }

    public static void main(String[] args) {
        System.out.println(solution(10000));
    }
}
