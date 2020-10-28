# Tried
class Tried:
    def tried(self):
        n, m, k = 10, 7, 3
        numbers = [10, 5, 100, 200, 3, 7, 10, 1, 50]
        sorted_numbers = sorted(numbers, reverse=True)
        sum = 0

        while m > 0:
            for i in range(k):
                if m == 0:
                    return sum
                sum += sorted_numbers[0]
                m -= 1

            if m == 0:
                return sum
            sum += sorted_numbers[1]
            m -= 1

sum = Tried.tried(self=True)
print(sum)


#Solution
class Solution:
    def solution(self):
        n, m, k = map(int, input().split())
        data = list(map(int, input().split()))

        data.sort()
        first = data[n - 1]
        second = data[n - 2]

        result = 0

        while True:
            for i in range(k):
                if m == 0:
                    break
                result += first
                m -= 1
            if m == 0:
                break
            result += second
            m -= 1
        return result
