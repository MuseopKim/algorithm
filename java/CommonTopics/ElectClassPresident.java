package CommonTopics;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ElectClassPresident {

    static Character electClassPresident(int studentCount, char[] selections) {
        Map<Character, Integer> candidates = new HashMap<>();

        for (char selection: selections) {
            candidates.put(selection, candidates.getOrDefault(selection, 0) + 1);
        }

        int maxValue = 0;
        char president = ' ';

        for (Entry<Character, Integer> entry : candidates.entrySet()) {
            int value = entry.getValue();

            if (value > maxValue) {
                maxValue = value;
                president = entry.getKey();
            }
        }

        return president;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int studentCount = stdIn.nextInt();
        String selections = stdIn.next();

        System.out.println(electClassPresident(studentCount, selections.toCharArray()));
    }
}
