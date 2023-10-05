package Programmers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WorkoutClothes {

    static int solution(int n, int[] lost, int[] reserve) {
        int maxCount = n - lost.length;

        Map<Integer, Boolean> reserveMap = new HashMap<>();
        Set<Integer> lostSet = new HashSet<>();

        for (int student : lost) {
            lostSet.add(student);
        }

        for (int student : reserve) {
            if (lostSet.contains(student)) {
                lostSet.remove(student);
                maxCount += 1;
                continue;
            }

            reserveMap.put(student, true);
        }

        for (int student : lostSet) {
            if (reserveMap.containsKey(student - 1) && reserveMap.get(student - 1)) {
                reserveMap.put(student - 1, false);
                maxCount += 1;
                continue;
            }

            if (reserveMap.containsKey(student + 1) && reserveMap.get(student + 1)) {
                reserveMap.put(student + 1, false);
                maxCount += 1;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        System.out.println(solution(5, new int[]{2, 4}, new int[]{1, 3, 5}));
    }
}
