# Tried
class Tried:
    def tried(self):
        given = 5000
        price = 3260

        change = given - price
        money = [500, 100, 50, 10]
        total_count = 0

        for currency in money:
            total_count += change // currency
            change %= currency

        print(total_count)

# Solution
class Solution:
    def solution(self):
        n = 1260
        count = 0

        coin_types = [500, 100, 50, 10]

        for coin in coin_types:
            count += n // coin
            n %= coin

        print(count)
        