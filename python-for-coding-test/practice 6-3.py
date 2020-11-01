class Tried:
    def tried(self):
        n, k = map(int, input().split())
        a = list(map(int, input().split()))
        b = list(map(int, input().split()))

        a.sort()
        b.sort()

        count = 0
        finished = False
        print(n, k, a, b)

        while True:
            if count == k:
                break
            finished = False
            for j in range(n):
                for i in range(n - 1, 0 - 1, -1):
                    if a[j] < b[i]:
                        a[j], b[i] = b[i], a[j]
                        a.sort()
                        b.sort()
                        finished = True
                        count += 1
                        break
                if finished:
                    break
            else:
                count = k


class Solution:
    def solution(self):
        n, k = map(int, input().split())
        a = list(map(int, input().split()))
        b = list(map(int, input().split()))

        a.sort()
        b.sort(reverse=True)

        for i in range(k):
            if a[i] < b[i]:
                a[i], b[i] = b[i], a[i]
            else:
                break