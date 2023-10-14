package leetcode.arraypartition_561;

import java.util.Arrays;

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
}
