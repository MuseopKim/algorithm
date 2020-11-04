# Tried
class Tried:
    def tried(self):
        nums = [1, 2, 3, 4]
        output = []

        for i in range(len(nums)):
            indexes = [j for j in range(0, len(nums)) if j != i]
            result = 1
            for index in indexes:
                result *= nums[index]
            output.append(result)

        return output


# Solution
class Solution:
    def solution(self):
        nums = [1, 2, 3, 4]
        out = []

        # 왼쪽 곱셈
        p = 1
        for i in range(0, len(nums)):
            out.append(p)
            p = p * nums[i]

        # 왼쪽 곱셈 결과에 오른쪽 값을 차례대로 곱셈
        p = 1
        for i in range(len(nums) - 1, 0 - 1, -1):
            out[i] = out[i] * p
            p = p * nums[i]

        return out
