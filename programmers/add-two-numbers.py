class Solution:
    def solution(self):
        numbers = [2, 1, 3, 4, 1]
        result = []

        for i in range(len(numbers) - 1):
            for j in range(i + 1, len(numbers)):
                sum = numbers[i] + numbers[j]
                if sum not in result:
                    result.append(sum)
                    continue

        result = sorted(result, key=lambda number: number)

        return result

print(Solution.solution(self=True))