import sys
sys.stdin = open('k-th-number/input.txt', 'rt')

class Tried:
    def tried(self):
        t = int(input())
        cases = []
        for i in range(t):
            n, s, e, k = map(int, input().split())
            numbers = list(map(int, input().split()))
            partials = sorted(numbers[s - 1:e])
            cases.append((i + 1, partials[k - 1]))

        for case in cases:
            print(f"#{case[0]} {case[1]}")



class Solution:
    def solution(self):
        T = int(input())
        for t in range(T):
            n, s, e, k = map(int, input().split())
            a = list(map(int, input().split()))
            a = a[s - 1:e]
            a.sort()
            print("#%d %d" %(t + 1, a[k - 1]))
            