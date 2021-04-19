class Tried:
    def tried(self):
        n, k = map(int, input().split())
        factors = []

        for i in range(1, n + 1):
            if n % i == 0:
                factors.append(i)

        if len(factors) < k:
            print(-1)
            return

        print(factors[k - 1])


class Solution:
    def solution(self):
        n, k = map(int, input().split())
        count = 0

        for i in range(1, n + 1):
            if n % i == 0:
                count += 1
            if count == k:
                print(i)
                break
        else:
            print(-1)
