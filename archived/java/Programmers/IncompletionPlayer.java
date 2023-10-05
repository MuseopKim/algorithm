package Programmers;

import java.util.HashMap;
import java.util.Map;

public class IncompletionPlayer {

    static String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }

        for (String player : completion) {
            if (!map.containsKey(player)) {
                return player;
            }

            map.put(player, map.get(player) - 1);
        }

        for (Map.Entry<String, Integer> set : map.entrySet()) {
            if (set.getValue() > 0) {
                return set.getKey();
            }
        }

        return "Complete";
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[] { "marina", "josipa", "nikola", "vinko", "filipa" },
                                    new String[] { "josipa", "filipa", "marina", "nikola" }));
    }
}
