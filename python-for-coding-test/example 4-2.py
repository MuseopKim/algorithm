# Tried
class Tried:
    def tried(self):
        n = 5
        count = 0

        if n == 23:
            count += 3 * (6 ** 2) * (10 ** 2)

        if n < 23 and n >= 13:
            count += 2 * (6 ** 2) * (10 ** 2)
            count += ((n + 1 - 2) * (15 * 45) * 2) + ((n + 1 - 2) * 15 * 15)

        if n < 13 and n > 0:
            count += 1 * (6 ** 2) * (10 ** 2)
            count += ((n + 1 - 1) * (15 * 45) * 2) + ((n + 1 - 1) * 15 * 15)

        if n == 0:
            count += (((15 * 45) * 2) + (15 * 15))

        print(count)


# Solution
class Solution:
    def solution(self):
        h = int(input())

        count = 0
        for i in range(h + 1):
            for j in range(60):
                for k in range(60):
                    # 매 시각 안에 '3'이 포함되어 있다면 카운트 증가
                    if '3' in str(i) + str(j) + str(k):
                        count += 1

        print(count)