import sys
sys.stdin = open('input.txt', 'rt')

# Tried
class Tried:
    def tried(self):
        n = int(input())
        o_x = list(map(int, input().split()))
        score = 0
        result = 0

        for answer in o_x:
            if answer == 1:
                score += 1
                result += score

            if answer == 0:
                score = 0

        print(result)


# Solution
class Solution:
    def solution(self):
        n = int(input())
        a = list(map(int, input().split()))
        sum = 0
        cnt = 0
        for x in a:
            if x == 1:
                cnt += 1
                sum += cnt
            else:
                cnt = 0

        print(sum)
