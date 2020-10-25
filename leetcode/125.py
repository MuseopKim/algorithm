import collections
from typing import Deque, re


# Tried
class Tried:
    def isPalindrome(self, s: str) -> bool:
        # 모든 문자를 소문자로 바꾼다.
        string_ignore_case = s.lower()

        # 모든 문자 사이에 공백을 만든다.
        string_separated_by_blank = " ".join(string_ignore_case)

        # 공백으로 구분하여 문자 리스트를 만든다.
        character_list_contain_blank = string_separated_by_blank.split(" ")

        # 알파벳인 문자들만 필터링 해서 새로운 리스트로 만든다.
        character_list_only_alnum = [character for character in character_list_contain_blank if character.isalnum()]

        # 리스트의 앞쪽 인덱스와 뒷 쪽 인덱스를 비교하여 팰린드롬인지 판별한다.
        for i in range(len(character_list_only_alnum) // 2):
            if character_list_only_alnum[i] != character_list_only_alnum[-i - 1]:
                return False
        return True


# Solution 1
class Solution1:
    def isPalindrome(self, s: str) -> bool:
        strs = []
        for char in s:
            if char.isalnum():
                strs.append(char.lower())

        while len(strs) > 1:
            if strs.pop(0) != strs.pop():
                return False
        return True


# Solution 2
class Solution2:
    def isPalindrome(self, s: str) -> bool:
        strs: Deque = collections.deque()

        for char in s:
            if char.isalnum():
                strs.append(char.lower())

        while len(strs) > 1:
            if strs.popleft() != strs.pop():
                return False

        return True


# Solution 3
class Solution3:
    def isPalindrome(self, s: str) -> bool:
        s = s.lower()
        s = re.sub('[^a-z0-9]', '', s)

        return s == s[::-1]

