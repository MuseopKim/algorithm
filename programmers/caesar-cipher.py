class Solution:
    def solution(self):
        s = "AB"
        n = 1
        list_str = list(s)
        for i in range(len(list_str)):
            if list_str[i] == ' ':
                continue

            ascii_number = ord(list_str[i])
            if ascii_number <= 90 and ascii_number >= 65:
                if (ascii_number + n) > 90:
                    ascii_number = 64 + ((ascii_number + n) - 90)
                else:
                    ascii_number += n
            elif ascii_number >= 97 and ascii_number <= 122:
                if (ascii_number + n) > 122:
                    ascii_number = 96 + ((ascii_number + n) - 122)
                else:
                    ascii_number += n

            list_str[i] = chr(ascii_number)

        return ''.join(list_str)
