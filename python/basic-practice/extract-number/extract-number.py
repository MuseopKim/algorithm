import sys
sys.stdin = open('input.txt', 'rt')

# Tried
class Tried:
    def tried(self):
        str = input()
        str_array = list(str)
        numbers = []

        for character in str_array:
            if character.isdigit():
                numbers.append(character)

        number = int(''.join(numbers))

        divisor_count = 0
        for i in range(1, number + 1):
            if number % i == 0:
                divisor_count += 1

        print(number)
        print(divisor_count)

# Solution
class Solution:
    def solution(self):
        s = input()
        res = 0
        for x in s:
            res = res * 10 + int(x)

        print(res)
        cnt = 0
        for i in range(1, res + 1):
            if res % i == 0:
                cnt += 1

        print(cnt)