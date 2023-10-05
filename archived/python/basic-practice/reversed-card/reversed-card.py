import sys
sys.stdin = open('input.txt', 'rt')

# Tried
class Tried:
    def tried(self):
        cards = [i + 1 for i in range(20)]

        for i in range(10):
            a, b = map(int, input().split())
            left, right = a - 1, b - 1

            while left < right:
                cards[left], cards[right] = cards[right], cards[left]
                left += 1
                right -= 1

        for card in cards:
            print(card, end = ' ')

# Solution
class Solution:
    def solution(self):
        a = list(range(21))

        for _ in range(10):
            s, e = map(int, input().split())
            for i in range((e - s + 1) // 2):
                a[s + i], a[e - i] = a[e - i], a[s + i]

        a.pop(0)

        for x in a:
            print(x, end = ' ')

