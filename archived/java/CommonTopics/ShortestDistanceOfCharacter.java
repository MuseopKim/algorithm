package CommonTopics;

import java.util.Scanner;

public class ShortestDistanceOfCharacter {

    static int[] calculateDistance(String str, char character) {
        int distance = 1000;
        int[] distances = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                distance = 0;
                distances[i] = distance;
                continue;
            }

            distance += 1;
            distances[i] = distance;
        }

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == character) {
                distance = 0;
                distances[i] = 0;
                continue;
            }

            distance += 1;

            if (distances[i] > distance) {
                distances[i] = distance;
            }
        }

        return distances;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String str = stdIn.next();
        String character = stdIn.next();

        int[] distances = calculateDistance(str, character.charAt(0));

        for (int distance : distances) {
            System.out.print(distance + " ");
        }
    }
}
