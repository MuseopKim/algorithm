package leetcode.twosum_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            numbers.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (numbers.containsKey(target - nums[i]) && i != numbers.get(target - nums[i])) {
                return new int[]{i, numbers.get(target - nums[i])};
            }
        }

        return new int[]{};
    }

    public int[] solution1(int[] nums, int target) {
        Map<Integer, Integer> numbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (numbers.containsKey(target - nums[i])) {
                return new int[]{numbers.get(target - nums[i]), i};
            }

            numbers.put(nums[i], i);
        }

        return null;
    }
}
