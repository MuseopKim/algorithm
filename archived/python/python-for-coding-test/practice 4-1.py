# Tried
class Tried:
    def tried(self):
        n = list('a1')
        column_point = n[0]
        row_point = int(n[1])

        rows = [1, 2, 3, 4, 5, 6, 7, 8]
        columns = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h']

        count = 0

        input_column_index = columns.index(column_point)
        uur = (input_column_index + 1, row_point - 2)
        uul = (input_column_index - 1, row_point - 2)
        ddr = (input_column_index + 1, row_point + 2)
        ddl = (input_column_index - 1, row_point + 2)
        rru = (input_column_index + 2, row_point - 1)
        rrd = (input_column_index + 2, row_point + 1)
        llu = (input_column_index - 2, row_point - 1)
        lld = (input_column_index - 2, row_point + 1)

        move_types = [uur, uul, ddr, ddl, rru, rrd, llu, lld]

        for move_type in move_types:
            if move_type[0] >= 0 and move_type[0] < 8 and move_type[1] > 0 and move_type[1] < 9:
                count += 1

        print(count)

# Solution
class Solution:
    def solution(self):
        input_data = input()
        row = int(input_data[1])
        column = int(ord(input_data[0])) - int(ord('a')) + 1

        steps = [(-2, -1), (-1, -2), (1, -2), (2, -1), (2, 1), (1, 2), (-1, 2), (-2, 1)]

        result = 0
        for step in steps:
            # 이동하고자 하는 위치 확인
            next_row = row + step[0]
            next_column = column + step[1]
            #해당 위치로 이동이 가능하다면 카운트 증가
            if next_row >= 1 and next_row <= 8 and next_column >= 1 and next_column <= 8:
                result += 1

        print(result)


# Modify
class Modify:
    def modify(self):
        input_data = input()
        row = int(input_data[1])
        column = int(ord(input_data[0])) - int(ord('a')) + 1
        count = 0

        row_move = [-2, -2, 2, 2, -1, 1, -1, 1]
        column_move = [1, -1, 1, -1, 2, 2, -2, -2]
        move_types = ["UUR", "UUL", "DDR", "DDL", "RRU", "RRD", "LLU", "LLD"]

        for i in range(len(move_types)):
            new_row = row + row_move[i]
            new_column = column + column_move[i]

            if new_row > 0 and new_row < 8 and new_column > 0 and new_column < 8:
                count += 1

        print(count)
