# Tried
class Tried:
    def tried(self):
        n = 5
        commands = ['R', 'R', 'R', 'U', 'D', 'D']
        row, column = 1, 1
        for command in commands:
            if command == 'R' and column < n:
                column += 1
            if command == 'L' and column > 1:
                column -= 1
            if command == 'U' and row > 1:
                row -= 1
            if command == 'D' and row < n:
                row += 1

        print(f"{column} {row}")


# Soltuion
class Solution:
    def solution(self):
        n = int(input())
        x, y = 1, 1
        plans = input().split()

        # L, R, U, D에 따른 이동 방향
        dx = [0, 0, -1, 1]
        dy = [-1, 1, 0, 0]
        move_types = ['L', 'R', 'U', 'D']

        for plan in plans:
            for i in range(len(move_types)):
                if plan == move_types[i]:
                    nx = x + dx[i]
                    ny = y + dy[i]

                if nx < 1 or ny < 1 or nx > n or ny > n:
                    continue

                x, y = nx, ny

        print(x, y)

# Modify
class Modify:
    def modify(self):
        n = 5
        plans = ['R', 'R', 'R', 'U', 'D', 'D']

        column, row = 1, 1
        move_column = [1, -1, 0, 0]
        move_row = [0, 0, -1, 1]
        move_types = ['R', 'L', 'U', 'D']

        for plan in plans:
            for i in range(len(move_types)):
                if plan == move_types[i]:
                    new_column = column + move_column[i]
                    new_row = row + move_row[i]

            if new_column < 1 or new_row < 1 or new_column > n or new_row > n:
                continue

            column = new_column
            row = new_row

        print(column, row)
