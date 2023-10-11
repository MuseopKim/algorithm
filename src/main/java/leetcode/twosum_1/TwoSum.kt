package leetcode.twosum_1

fun twoSum(nums: IntArray, target: Int): IntArray {
    val numbers = mutableMapOf<Int, Int>()

    for ((index, num) in nums.withIndex()) {
        if (numbers.containsKey(target - num)) {
            return intArrayOf(numbers.get(target - num) ?: 0, index)
        }

        numbers.put(num, index)
    }

    return intArrayOf(0, 0)
}
