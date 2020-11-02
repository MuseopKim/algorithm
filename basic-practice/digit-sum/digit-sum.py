import sys
sys.stdin = open('input.txt', 'rt')

class Tried:
    def tried(self):
        n = int(input())
        numbers = list(input().split())

        """
            1. 문자를 각각 숫자로 변환한다.
            2. 해당 숫자들의 합을 구한다.
            3. max 변수에 담겨 있는 값과 비교 한다.
        """
        max = 0
        result = 0

        def digit_sum(x):
            digits = list(x)
            print(digits)
            print(sum(map(int, digits)))
            return sum(map(int, digits))


        for number in numbers:
            digits = list(number)
            total = digit_sum(digits)
            if total > max:
                max = total
                result = number

        print(result)


# Solution 1
class Solution1:
    def solution1(self):
        n = int(input())
        a = list(map(int, input().split()))

        def digit_sum(x):
            sum = 0
            while x > 0:
                sum += x % 10
                x = x // 10
            return sum

        max = -2147000000
        res = 0

        for x in a:
            tot = digit_sum(x)
            if tot > max:
                max = tot
                res = x

        print(res)

# Solution 2
class Solution2:
    n = int(input())
    a = list(map(int, input().split()))

    def digit_sum(x):
        sum = 0
        for i in str(x):
            sum += int(i)
        return sum

    max = -2147000000
    res = 0

    for x in a:
        tot = digit_sum(x)
        if tot > max:
            max = tot
            res = x

    print(res)