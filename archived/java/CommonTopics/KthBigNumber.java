package CommonTopics;

import java.util.*;

public class KthBigNumber {

    static int findKthBigNumber(int[] source, int ranking) {
        TreeSet<Integer> numbers = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < source.length - 2; i++) {
            for (int j = i + 1; j < source.length - 1; j++) {
                for (int k = j + 1; k < source.length; k++) {
                    numbers.add(source[i] + source[j] + source[k]);
                }
            }
        }

        Iterator<Integer> iterator = numbers.iterator();

        int result = -1;
        int index = 0;
        int currentNumber = result;

        while (iterator.hasNext()) {
            currentNumber = iterator.next();

            if (index == ranking - 1) {
                result = currentNumber;
                break;
            }

            index += 1;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int count = stdIn.nextInt();
        int[] source = new int[count];

        int ranking = stdIn.nextInt();

        for (int i = 0; i < count; i++) {
            source[i] = stdIn.nextInt();
        }

        System.out.println(findKthBigNumber(source, ranking));
    }
}
