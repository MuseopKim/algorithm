class Tried:
    def tried(self):
        n = int(input())
        numbers = []

        for i in range(n):
            numbers.append(int(input()))

        numbers.sort(reverse=True)

        for number in numbers:
            print(number, end = ' ')


class Solution:
    def solution(self):
        n = int(input())

        array = []
        for i in range(n):
            array.append(int(input()))

        array = sorted(array, reverse=True)

        for i in array:
            print(i, end = ' ')