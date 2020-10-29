# Tried
class Tried:
    def tried(self):
        """
        k로 나눌 때 떨어져야 나눌 수 있다.
        n이 1이 될 때까지
        """
        n, k = 25, 5
        count = 0

        while True:
            if n == 1:
                break

            if n % k == 0:
                n //= k
                count += 1
                continue

            n -= 1
            count += 1

        print(count)


# Solution1
class Solution1:
    def solution(self):
        n, k = map(int, input().split())
        result = 0

        # N 이 K 이상이라면 계속 나누기
        while n >= k:

            while n % k != 0:
                n -= 1
                result += 1
            n //= k
            result += 1

        while n > 1:
            n -= 1
            result += 1

        print(result)

# Solution2
class Solution2:
    def solution2(self):
        n, k = map(int, input().split())
        result = 0

        while True:
            # (N == K로 나누어 떨어지는 수)가 될 때까지 1씩 빼기
            target = (n // k) * k
            result += (n - target)
            n = target

            # N이 K보다 작을 때 반복문 탈출
            if n < k:
                break

            result += 1
            n //= k

        result += (n - 1)
        print(result)
