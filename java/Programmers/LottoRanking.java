package Programmers;

public class LottoRanking {

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
        int tempNumber = numbers[end];
        numbers[end] = numbers[pivotIndex];
        numbers[pivotIndex] = tempNumber;

        return pivotIndex;
    }

    static void quickSort(int[] numbers, int begin, int end) {
        if (begin < end) {
            int pivotIndex = partition(numbers, begin, end);
            quickSort(numbers, begin, pivotIndex - 1);
            quickSort(numbers, pivotIndex + 1, end);
        }
    }

    static int decideRanking(int score) {
        if (score == 0) {
            return 6;
        }

        return 7 - score;
    }

    static int[] solution(int[] lottos, int[] win_nums) {
        int length = lottos.length;

        // 복습을 위해 굳이 6개 밖에 안되는 원소를 퀵소트로 정렬
        quickSort(lottos, 0, length - 1);
        quickSort(win_nums, 0, length - 1);

        int zeroCount = 0;
        int lastZeroIndex = -1;

        for (int i = 0; i < length; i++) {
            if (lottos[i] == 0) {
                zeroCount += 1;
                lastZeroIndex += 1;
            } else {
                break;
            }
        }

        int winCount = 0;
        int lottosIndex = lastZeroIndex + 1;
        int winNumsIndex = 0;

        while (lottosIndex < length && winNumsIndex < length) {
            if (lottos[lottosIndex] == win_nums[winNumsIndex]) {
                winCount += 1;
                lottosIndex += 1;
                winNumsIndex += 1;
                continue;
            }

            if (lottos[lottosIndex] < win_nums[winNumsIndex]) {
                lottosIndex += 1;
            } else {
                winNumsIndex += 1;
            }
        }

        int bestRanking = decideRanking(zeroCount + winCount);
        int worstRanking = decideRanking(winCount);

        return new int[] { bestRanking, worstRanking };
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] { 44, 1, 0, 0, 31, 25 }, new int[] { 31, 10, 45, 1, 6, 19 }));
    }
}
