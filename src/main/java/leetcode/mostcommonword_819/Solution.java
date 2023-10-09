package leetcode.mostcommonword_819;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/most-common-word
 */
public class Solution {

    public String mostCommonWord(String paragraph, String[] banned) {
        String trimmed = paragraph.replaceAll("\\W+", " ").toLowerCase();

        String[] words = trimmed.split(" ");
        Map<String, Integer> wordCounts = Arrays.stream(words)
                .collect(Collectors.toMap(Function.identity(), word -> 0, (a, b) -> a));

        Set<String> bannedWords = Set.of(banned);

        for (String word : words) {
            if (bannedWords.contains(word)) {
                continue;
            }

            wordCounts.computeIfPresent(word, (k, value) -> value + 1);
        }

        return wordCounts.entrySet().stream()
                .sorted((entry1, entry2) -> {
                    if (entry1.getValue() >= entry2.getValue()) {
                        return -1;
                    }

                    return 1;
                })
                .findFirst()
                .map(entry -> entry.getKey())
                .get();
    }

    public String solution1(String paragraph, String[] banned) {
        Set<String> ban = new HashSet<>(Arrays.asList(banned));

        Map<String, Integer> counts = new HashMap<>();

        String[] words = paragraph.replaceAll("\\W+", " ").toLowerCase().split(" ");

        for (String word : words) {
            if (!ban.contains(word)) {
                counts.put(word, counts.getOrDefault(word, 0) + 1);
            }
        }

        return Collections.max(counts.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
