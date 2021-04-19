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


#Solution 1
class Solution1:
    def solution1(self):
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


# Solution 2
class Solution2:
    def solution2(self):
        n, m, k = map(int, input().split())
        data = list(map(int, input().split()))

        data.sort()
        first = data[n - 1]
        second = data[n - 2]

        # 가장 큰 수가 더해지는 횟수
        # (k + 1) : 반복되는 수열의 길이
        count = int(m / (k + 1)) * k
        count += m % (k + 1)

        result = 0
        result += (count) * first
        result += (m - count) * second