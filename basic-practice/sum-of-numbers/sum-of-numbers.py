import sys
sys.stdin = open('input.txt', 'rt')

# Tried
class Tried:
    def tried(self):
        n, m = map(int, input().split())
        numbers = list(map(int, input().split()))

        count = 0

        for i in range(len(numbers)):
            j = len(numbers)
            while i < j:
                if sum(numbers[i:j]) == m:
                    count += 1
                j -= 1

        print(count)


# Tried 2
class Tried2:
    def tried2(self):
        n, m = map(int, input().split())
        numbers = list(map(int, input().split()))

        count = 0

        for i in range(len(numbers) - 1):
            now_total = numbers[i]
            for j in range(i + 1, len(numbers)):
                if now_total > m:
                    break

                total = sum(numbers[i:j])

                if total == m:
                    count += 1

                now_total = total

        print(count)

# Solution
class Solution:
    def solution(self):
        n, m = map(int, input().split())
        a = list(map(int, input().split()))

        lt = 0
        rt = 1
        tot = a[0]
        cnt = 0
        while True:
            if tot < m:
                if rt < n:
                    tot += a[rt]
                    rt += 1
                else:
                    break
            elif tot == m:
                cnt += 1
                tot -= a[lt]
                lt += 1
            else:
                tot -= a[lt]
                lt += 1

        print(cnt)


Solution.solution(self=True)