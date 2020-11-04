import collections
import sys
sys.stdin = open('input.txt', 'rt')

# Tried 1
class Tried1:
    def tried1(self):
        n = int(input())
        words = [input() for _ in range(n)]
        results = []

        for i in range(n):
            word = words[i].lower()
            left, right = 0, len(word) - 1
            while left < right:
                if word[left] == word[right]:
                    left += 1
                    right -= 1
                else:
                    results.append('NO')
                    break
            else:
                results.append('YES')

        for j in range(n):
            print(f"#{j + 1} {results[j]}")


# Tried 2
class Tried2:
    def tried2(self):
        n = int(input())
        words = [input() for _ in range(n)]

        for i in range(n):
            word = list(words[i].lower())
            reversed_word = list(reversed(word))
            for j in range(len(word) - 1, 0 - 1, -1):
                if word[j] == reversed_word[j]:
                    word.pop()
                    reversed_word.pop()
                    continue
                else:
                    print(f"#{i + 1} NO")
                    break
            else:
                print(f"#{i + 1} YES")


# Tried 3
class Tried3:
    def tried3(self):
        n = int(input())
        words = [input() for _ in range(n)]

        for i in range(n):
            word = collections.deque(words[i].lower())
            while len(word) > 1:
                if word.popleft() != word.pop():
                    print(f"#{i + 1} NO")
                    break
            else:
                print(f"#{i + 1} YES")

# Solution 1
class Solution1:
    def solution1(self):
        n = int(input())

        for i in range(n):
            s = input()
            s.upper()
            size = len(s)
            for j in range(size // 2):
                if s[j] != s[-1 - j]:
                    print("#%d NO" % (i + 1))
                    break
            else:
                print("#%d YES" % (i + 1))

# Solution 2
class Solution2:
    def solution2(self):
        n = int(input())

        for i in range(n):
            s = input()
            s = s.upper()
            if s == s[::-1]:
                print("#%d YES" % (i + 1))
            else:
                print("#%d NO" % (i + 1))

str = "HELLO"
str_list = list(str)
str2 = str[::-1]
str2_list = str_list[::-1]
print(str2_list)