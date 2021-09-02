package Programmers;

public class Budget {

    static int partition(int[] numbers, int begin, int end) {
        int pivot = numbers[end];
        int lowerGroupIndex = begin - 1;

        for (int i = begin; i < end; i++) {
            if (numbers[i] <= pivot) {
                lowerGroupIndex += 1;
                int temp = numbers[i];
                numbers[i] = numbers[lowerGroupIndex];
                numbers[lowerGroupIndex] = temp;
            }
        }

        int pivotIndex = lowerGroupIndex + 1;
        int temp = numbers[pivotIndex];
        numbers[pivotIndex] = numbers[end];
        numbers[end] = temp;

        return pivotIndex;
    }

    static void quickSort(int[] numbers, int begin, int end) {
        if (begin < end) {
            int pivotIndex = partition(numbers, begin, end);
            quickSort(numbers, begin, pivotIndex - 1);
            quickSort(numbers, pivotIndex + 1, end);
        }
    }

    static int solution(int[] d, int budget) {
        int length = d.length;
        quickSort(d, 0, length - 1);

        int left = 0;
        int result = 0;
        int count = 0;
        int sum = 0;

        for (int right = left; right < length; right++) {
            sum += d[right];

            if (sum <= budget) {
                count += 1;

                if (count > result) {
                    result = count;
                }
            }

            if (sum > budget) {
                sum -= d[left];
                count -= 1;
                left += 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] { 1,3,2,5,4 }, 9));
    }
}
