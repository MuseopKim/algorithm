package CommonTopics;

import java.util.Scanner;

public class MathMentoring {

    static int findValidMentoring(int studentCount, int testCount, int[][] rankings) {
      int validCount = 0;

      for (int i = 1; i <= studentCount; i++) {
          for (int j = 1; j <= studentCount; j++) {
              if (i == j) {
                  continue;
              }

              int count = 0;

              for (int k = 0; k < testCount; k++) {
                  int positionI = 0;
                  int positionJ = 0;

                  for (int m = 0; m < studentCount; m++) {
                      if (rankings[k][m] == i) {
                          positionI = m;
                      }

                      if (rankings[k][m] == j) {
                          positionJ = m;
                      }
                  }

                  if (positionI < positionJ) {
                      count += 1;
                  }
              }

              if (count == testCount) {
                  validCount += 1;
              }
          }
      }

      return validCount;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int studentCount = stdIn.nextInt();
        int testCount = stdIn.nextInt();

        int[][] rankings = new int[testCount][studentCount];

        for (int i = 0; i < testCount; i++) {
            for (int j = 0; j < studentCount; j++) {
                rankings[i][j] = stdIn.nextInt();
            }
        }

        int validCount = findValidMentoring(studentCount, testCount, rankings);

        System.out.println(validCount);
    }
}
