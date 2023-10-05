import sys
sys.stdin = open('input.txt', 'rt')

"""
    N -> 1부터 100까지의 숫자가 적힌 카드의 개수 (입력 되는 값의 개수)
    3 -> 뽑아야 할 카드의 수
    K -> 3장을 뽑아 만들 수 있는 모든 합의 경우를 기록한 값 중 그 합이 몇 번째로 큰 수인지
   
    1. n번째 + (n + 1) 번째
            + (n + 2 ~ 끝) 번째
    2. 중복은 무시해야 한다.
"""

class Tried:
    def tried(self):
        n, k = map(int, input().split())
        numbers = list(map(int, input().split()))

        numbers.sort(reverse=True)
        sum_numbers = []

        for i in range(n - 2):
            for j in range(i + 2, n):
                sum_numbers.append(numbers[i] + numbers[i + 1] + numbers[j])

        sorted_sum_numbers = []
        for number in sum_numbers:
            if number not in sorted_sum_numbers:
                sorted_sum_numbers.append(number)

        sorted_sum_numbers.sort(reverse=True)
        print(sorted_sum_numbers[k - 1])


class Solution:
    def solution(self):
        n, k = map(int, input().split())
        a = list(map(int, input().split()))
        res = set()

        for i in range(n):
            for j in range(i + 1, n):
                for m in range(j + 1, n):
                    res.add(a[i] + a[j] + a[m])

        res = list(res)
        res.sort(reverse=True)
        print(res[k - 1])