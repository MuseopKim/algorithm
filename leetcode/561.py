# Tried
class Tried:
    def tried(self):
        nums = [6, 2, 6, 5, 1, 2]
        nums.sort(reverse=True)
        result = 0

        for i in range(0, len(nums) - 1, 2):
            result += min(nums[i], nums[i + 1])

        return result


# Solution 1 : 오름차순 풀이
class Solution1:
    def solution(self):
        nums = [6, 2, 6, 5, 1, 2]
        sum = 0
        pair = []
        nums.sort()

        for n in nums:
            pair.append(n)
            if len(pair) == 2:
                sum += min(pair)
                pair = []

        return sum


# Solution 2 : 짝수 번째 값 계산
class Solution2:
    def solution(selfself):
        nums = [6, 2, 6, 5, 1, 2]
        sum = 0
        nums.sort()

        for i, n in enumerate(nums):
            if i % 2 == 0:
                sum += n

        return sum
