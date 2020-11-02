import sys
sys.stdin = open('input.txt', 'rt')

"""
    1. 두 리스트에 대하여 순회하며 연산하고, 딕셔너리에 합(키) - 횟수(값)으로 저장
    2. 딕셔너리에서 값이 가장 큰 것들을 선별하여 오름차순으로 출력
"""

# Tried
class Tried:
    def tried(self):
        n, m = map(int, input().split())

        frequences = {}
        for i in range(1, n + 1):
            for j in range(1, m + 1):
                if i + j not in frequences:
                    frequences[i + j] = 0
                frequences[i + j] += 1

        max_frequence = max(frequences.values())
        for key, value in frequences.items():
            if value == max_frequence:
                print(key, end = ' ')


# Solution
class Solution:
    def solution(self):
        n, m = map(int, input().split())
        cnt = [0] * (n + m + 3)
        max = -2147000000

        for i in range(1, n + 1):
            for j in range(1, m + 1):
                cnt[i + j] += 1
        for i in range(n + m + 1):
            if cnt[i] > max:
                max = cnt[i]
        for i in range(n + m + 1):
            if cnt[i] == max:
                print(i, end = ' ')
