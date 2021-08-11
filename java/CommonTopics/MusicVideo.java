package CommonTopics;

import java.util.Scanner;

public class MusicVideo {

    static int result = 0;

    static void binarySearch(int[] songs, int begin, int end, int dvdCount) {
        if (begin > end) {
            return;
        }

        int count = 0;
        int middle = (begin + end) / 2;

        int index = 0;

        while (index < songs.length) {
            int sum = 0;

            while (sum <= middle && index < songs.length) {
                sum += songs[index];
                index += 1;

                if (sum > middle) {
                    index -=1;
                    break;
                }
            }

            count += 1;
        }

        if (count <= dvdCount) {
            result = middle;
            binarySearch(songs, begin, middle - 1, dvdCount);
        } else {
            binarySearch(songs, middle + 1, end, dvdCount);
        }
    }

    static int findMinimumDvdTime(int length, int[] songs, int dvdCount) {
        int minimum = 0;
        int maximum = 0;

        for (int i = 0; i < length; i++) {
            if (minimum < songs[i]) {
                minimum = songs[i];
            }

            maximum += songs[i];
        }

        binarySearch(songs, minimum, maximum, dvdCount);

        return result;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int length = stdIn.nextInt();
        int[] songs = new int[length];

        int dvdCount = stdIn.nextInt();

        for (int i = 0; i < length; i++) {
            songs[i] = stdIn.nextInt();
        }

        System.out.println(findMinimumDvdTime(length, songs, dvdCount));
    }
}
