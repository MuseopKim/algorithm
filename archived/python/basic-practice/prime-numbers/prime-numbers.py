import sys
# sys.stdin = open('input.txt', 'rt')

# Tried
class Tried:
    def tried(self):
        n = int(input())

        if n == 2:
            print(1)
            return

        prime_numbers = [2]

        for i in range(3, n + 1):
            for j in range(2, i):
                if i % j == 0:
                    break
            else:
                prime_numbers.append(i)

        print(len(prime_numbers))


# Solution
class Solution:
    def solution(self):
        n = int(input())
        ch = [0] * (n + 1)
        cnt = 0

        for i in range(2, n + 1):
            if ch[i] == 0:
                cnt += 1
                for j in range(i, n + 1, i):
                    ch[j] = 1

        print(cnt)