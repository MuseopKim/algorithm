package leetcode.arraypartition_561;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/array-partition
 */
public class ArrayPartition {

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int sum = 0;
        for (int i = 0; i <= nums.length - 2; i += 2) {
            sum += nums[i];
        }

        return sum;
    }

    public int solution1(int[] nums) {
        int sum = 0;
        List<Integer> pair = new ArrayList<>();
        Arrays.sort(nums);

        for (int num : nums) {
            pair.add(num);

            if (pair.size() == 2) {
                sum += Collections.min(pair);
                pair.clear();
            }
        }

        return sum;
    }
}
