package CommonTopics;

import java.util.*;

public class TypeOfSalesVolume {

    static List<Integer> findTypeOfSalesVolume(int count, int[] revenues, int range) {
        List<Integer> typeCount = new ArrayList<>();

        int left = 0;
        int right = range - 1;

        Map<Integer, Integer> types = new HashMap<>();

        for (int i = 0; i <= right; i++) {
            types.put(revenues[i], types.getOrDefault(revenues[i], 0) + 1);
        }

        typeCount.add(types.size());

        while (right < count - 1) {
            types.put(revenues[left], types.get(revenues[left]) - 1);

            if (types.get(revenues[left]) == 0) {
                types.remove(revenues[left]);
            }
            left += 1;

            right += 1;
            types.put(revenues[right], types.getOrDefault(revenues[right], 0) + 1);

            typeCount.add(types.size());
        }

        return typeCount;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int count = stdIn.nextInt();
        int[] revenues = new int[count];

        int range = stdIn.nextInt();

        for (int i = 0; i < count; i++) {
            revenues[i] = stdIn.nextInt();
        }

        for (int typeCount : findTypeOfSalesVolume(count, revenues, range)) {
            System.out.print(typeCount + " ");
        }
    }
}
