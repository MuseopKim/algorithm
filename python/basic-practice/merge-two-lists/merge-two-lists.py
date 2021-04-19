import sys

sys.stdin = open('input.txt', 'rt')

# Tried 1
class Tried:
    def tried1(self):
        n = int(input())
        first_list = list(map(int, input().split()))
        m = int(input())
        second_list = list(map(int, input().split()))

        result = sorted(first_list + second_list)

        for number in result:
            print(number, end = ' ')


# Tried 2
class Tried2:
    def tried2(self):
        n = int(input())
        first_list = list(map(int, input().split()))
        m = int(input())
        second_list = list(map(int, input().split()))

        first_pointer = 0
        second_pointer = 0
        result = []

        while True:
            if first_pointer == n:
                result += second_list[second_pointer:]
                break
            elif second_pointer == m:
                result += first_list[first_pointer:]
                break

            if first_list[first_pointer] <= second_list[second_pointer]:
                result.append(first_list[first_pointer])
                first_pointer += 1
                continue
            else:
                result.append(second_list[second_pointer])
                second_pointer += 1

        for number in result:
            print(number, end = ' ')


# Solution
class Solution:
    def solution(self):
        n = int(input())
        a = list(map(int, input().split()))
        m = int(input())
        b = list(map(int, input().split()))
        p1 = p2 = 0
        c = []

        while p1 < n and p2 < m:
            if a[p1] <= b[p2]:
                c.append(a[p1])
                p1 += 1
            else:
                c.append(b[p2])
                p2 += 1

        if p1 < n:
            c = c + a[p1:]
        if p2 < m:
            c = c + b[p2:]

        for x in c:
            print(x, end = ' ')
