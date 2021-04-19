# Tried
class Tried:
    def tried(self):
        nums = [3, 2, 4]
        target = 6

        for i in range(len(nums) - 1):
            for j in range(i + 1, len(nums)):
                sum = nums[i] + nums[j]
                if sum == target:
                    return [i, j]

# Solution 1 : in을 이용한 탐색
class Solution1:
    def solution1(self):
        nums = [3, 2, 4]
        target = 6

        for i, n in enumerate(nums):
            complement = target - n

            if complement in nums[i + 1:]:
                return nums.index(n), nums[i + 1:].index(complement) + (i + 1)


# Solution 2 : 첫 번째 수를 뺀 결과 키 조회
class Solution2:
    def solution2(self):
        nums = [3, 2, 4]
        target = 6

        nums_map = {}
        # 키와 값을 바꿔서 딕셔너리로 저장
        for i, num in enumerate(nums):
            nums_map[num] = i

        # 타겟에서 첫 번째 수를 뺀 결과를 키로 조회
        for i, num in enumerate(nums):
            if target - num in nums_map and i != nums_map[target - num]:
                return nums.index(num), nums_map[target - num]


# Solution 3 : Solution 2에 대한 조회 구조 개선
class Solution3:
    def solution3(self):
        nums = [3, 2, 4]
        target = 6

        nums_map = {}

        for i, num in enumerate(nums):
            if target - num in nums_map:
                return [nums_map[target - num], i]
            nums_map[target - num] = i