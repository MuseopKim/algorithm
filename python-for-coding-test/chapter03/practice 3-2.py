# Tried
class Tried:
    def tried(self):
        n, m = 3, 3
        cards = [[3, 1, 2], [4, 1, 4], [2, 2, 2]]
        smallest_cards = []
        '''
            1. 행을 돌면서 가장 작은 수를 하나씩 뽑는다.
                1. 열을 순회 하면서 가장 작은 수가 무엇인지 찾아낸다.
            2. 찾아낸 수 중 가장 큰 수를 가려낸다.
        '''
        for i in range(n):
            sorted_cards = sorted(cards[i])
            smallest_cards.append(sorted_cards[0])

        sorted_smallest_cards = sorted(smallest_cards)
        print(sorted_smallest_cards[n - 1])


# Solution1
class Solution1:
    def solution1(self):
        n, m = map(int, input().split())

        result = 0

        for i in range(n):
            data = list(map(int, input().split()))
            min_value = min(data)
            result = max(result, min_value)

        print(result)


# Solution2
class Solution2:
    def solution2(self):
        n, m = map(int, input().split())

        result = 0

        for i in range(n):
            data = list(map(int, input().split()))
            min_value = 10001
            for a in data:
                min_value = min(min_value, a)
            result = max(min_value, result)