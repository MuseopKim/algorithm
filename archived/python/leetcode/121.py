import sys

# Tried
class Tried:
    def tried(self):
        prices = [7, 1, 5, 3, 6, 4]
        max_profit = 0

        for i in range(len(prices) - 1):
            for j in range(i + 1, len(prices)):
                if prices[i] < prices[j]:
                    profit = abs(prices[i] - prices[j])
                    if profit > max_profit:
                        max_profit = profit

        return max_profit

# Solution 1 : 브루트 포스
class Solution1:
    def solution1(self):
        prices = [7, 1, 5, 3, 6, 4]
        max_price = 0

        for i, price in enumerate(prices):
            for j in range(i, len(prices)):
                max_price = max(prices[j] - price, max_price)

        return max_price

# Solution 2 : 저점과 현재 값과의 차이 계산
class Solution2:
    def solution2(self):
        prices = [7, 1, 5, 3, 6, 4]
        profit = 0
        min_price = sys.maxsize

        # 최솟값과 최댓값을 계속 갱신
        for price in prices:
            min_price = min(min_price, price)
            profit = max(profit, price - min_price)

        return profit

