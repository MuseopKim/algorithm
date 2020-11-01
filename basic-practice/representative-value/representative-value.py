import sys
sys.stdin = open('input.txt', 'rt')

"""
    N = 학생의 수
    
    1. N명의 학생들의 평균을 구한다.
    2. |평균 - 학생 점수| 가 가장 낮은 학생의 인덱스 번호를 가린다.
        - 2개가 동률일 경우 성적이 높은 학생 번호 출력
        - 2개 초과일 경우 번호가 가장 빠른 학생 출력
    
    * 번호를 출력해야 한다.  
"""

class Tried:
    def tried(self):
        n = int(input())
        scores = list(map(int, input().split()))
        average = round(sum(scores) / len(scores))

        calculated_scores = [0] * n

        for i in range(n):
            calculated_scores[i] = abs(scores[i] - average)

        indexes = []
        minimum = min(calculated_scores)

        for i in range(len(calculated_scores)):
            if calculated_scores[i] == minimum:
                indexes.append((i, scores[i]))

        number_of_students = len(indexes)

        if number_of_students == 1:
            print(average, indexes[0][0] + 1)
            return

        if number_of_students == 2:
            sorted_indexes = sorted(indexes, key = lambda index : indexes[1], reverse=True)
            print(average, sorted_indexes[0][0] + 1)
            return

        if number_of_students > 2:
            sorted_indexes = sorted(indexes, key = lambda index : indexes[0])
            print(average, sorted_indexes[0][0] + 1)
            return


class Solution:
    def solution(self):
        n = int(input())
        a = list(map(int, input().split()))
        ave = round(sum(a) / n)
        min = 2147000000
        score = 0

        # enumerate : 리스트의 인덱스, 값을 함께 조회
        for idx, x in enumerate(a):
            tmp = abs(x - ave)
            if tmp < min:
                min = tmp
                score = x
                res = idx + 1
            elif tmp == min:
                if x > score:
                    score = x
                    res = idx + 1

        print(ave, res)
