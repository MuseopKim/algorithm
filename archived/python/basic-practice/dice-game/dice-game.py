import sys
sys.stdin = open('input.txt', 'rt')

# Tried
class Tried:
    def tried(self):
        n = int(input())
        max = -2147000000

        for i in range(n):
            count = 1
            same_number = 0
            prize = 0
            numbers = list(map(int, input().split()))

            for j in range(2):
                for k in range(j, 3):
                    if numbers[j] == numbers[k]:
                        count += 1
                        same_number = numbers[j]

            if count == 1:
                prize = max(numbers) * 100
                if max < prize:
                    max = prize

            if count == 2:
                prize = 1000 + (same_number * 100)
                if max < prize:
                    max = prize

            if count == 3:
                prize = 10000 + (same_number * 1000)
                if max < prize:
                    max = prize

        print(max)


# Solution
class Solution:
    def solution(self):
        n = int(input())
        res = 0

        for i in range(n):
            tmp = input().split()
            tmp.sort()
            a, b, c = map(int, tmp)
            if a == b and b == c:
                money = 10000 + a * 1000
            elif a == b or a == c:
                money = 1000 + (a * 100)
            elif b == c:
                money = 1000 + (b * 100)
            else:
                money = c * 100
            if money > res:
                res = money
        print(res)