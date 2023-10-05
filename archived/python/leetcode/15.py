# Tried
class Tried:
    def tried(self):
        nums = [-1, 0, 1, 2, -1, -4]
        nums.sort()
        results = []

        for i in range(len(nums) - 2):
            for j in range(i + 1, len(nums) - 1):
                for k in range(j + 1, len(nums)):
                    if i > 0 and nums[i] == nums[i - 1]:
                        continue
                    if nums[i] + nums[j] + nums[k] == 0:
                        results.append([nums[i], nums[j], nums[k]])
        return results


# Solution 1 : 브루트 포스
class Solution1:
    def solution1(self):
        nums = [-1, 0, 1, 2, -1, -4]
        results = []
        nums.sort()

        for i in range(len(nums) - 2):
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            for j in range(i + 1, len(nums) - 1):
                if j > i + 1 and nums[j] == nums[j - 1]:
                    continue
                for k in range(j + 1, len(nums)):
                    if k > j + 1 and nums[k] == nums[k - 1]:
                        continue
                    if nums[i] + nums[j] + nums[k] == 0:
                        results.append(nums[i], nums[j], nums[k])
        return results


# Solution 2 : 투 포인터 합 계산
class Solution2:
    def solution2(self):
        nums = [-1, 0, 1, 2, -1, -4]
        results = []
        nums.sort()

        for i in range(len(nums) - 2):
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            left, right = i + 1, len(nums) - 1
            while left < right:
                sum = nums[i] + nums[left] + nums[right]
                if sum < 0:
                    left += 1
                elif sum > 0:
                    right -= 1
                else:
                    # sum = 0인 경우 정답 및 스킵 처리
                    results.append((nums[i], nums[left], nums[right]))

                    while left < right and nums[left] == nums[left + 1]:
                        left += 1
                    while left < right and nums[right] == nums[right - 1]:
                        right -= 1
                    left += 1
                    right -= 1
        return results
