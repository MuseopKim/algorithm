package CommonTopics;

import java.util.Scanner;

public class Mountaintop {

    static int solution(int count, int[][] lines) {
        int[] dx = { -1, 0, 1, 0 };
        int[] dy = { 0, 1, 0, -1 };

        int result = 0;

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                boolean mountaintop = true;

                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (nx >= 0 && nx < count && ny >= 0 && ny < count &&
                        lines[nx][ny] >= lines[i][j]) {
                        mountaintop = false;
                        break;
                    }
                }

                if (mountaintop) {
                    result += 1;
                }
            }
        }

        return result;
    }

    static int findTotalMountaintopCount(int[][] lines) {
        int count = 0;

        for (int i = 1; i < lines.length - 1; i++) {
            for (int j = 1; j < lines.length - 1; j++) {
                if (lines[i][j] > lines[i - 1][j] && lines[i][j] > lines[i + 1][j] &&
                    lines[i][j] > lines[i][j - 1] && lines[i][j] > lines[i][j + 1]) {
                    count += 1;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int count = stdIn.nextInt();

        int[][] lines = new int[count + 2][count + 2];

        for (int i = 0; i < lines.length; i++) {
            lines[0][i] = 0;
            lines[i][0] = 0;
            lines[lines.length - 1][i] = 0;
            lines[i][lines.length - 1] = 0;
        }

        for (int i = 1; i < lines.length - 1; i++) {
            for (int j = 1; j < lines.length - 1; j++) {
                lines[i][j] = stdIn.nextInt();
            }
        }

        int mountaintopCount = findTotalMountaintopCount(lines);

        System.out.println(mountaintopCount);
    }
}
