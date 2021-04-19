import sys
sys.stdin = open('input.txt', 'rt')

#Tried
class Tried:
    def tried(self):
        n = int(input())
        numbers = list(map(int, input().split()))

        def reverse(number):
            reversed_number = str(number)[::-1]
            return int(reversed_number)

        def is_prime(number):
            if number <= 1:
                return False

            if number == 2:
                return True

            for i in range(2, number):
                if number % i == 0:
                    return False
            else:
                return True

        for number in numbers:
            reversed_number = reverse(number)
            if is_prime(reversed_number):
                print(reversed_number, end = ' ')


# Solution
class Solution:
    def solution(self):
        n = int(input())
        a = list(map(int, input().split()))

        def reverse(x):
            res = 0
            while x > 0:
                t = x % 10
                res = res * 10 + t
                x = x // 10
            return res

        def isPrime(x):
            if x == 1:
                return False
            for i in range(2, (x // 2) + 1):
                if x % i == 0:
                    return False
            else:
                return True

        for x in a:
            tmp = reverse(x)
            if isPrime(tmp):
                print(tmp, end = ' ')