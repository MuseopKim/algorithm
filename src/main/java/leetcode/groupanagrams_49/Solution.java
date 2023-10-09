package leetcode.groupanagrams_49;

import java.util.*;

public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String str : strs) {
            char[] characters = str.toCharArray();
            Arrays.sort(characters);

            String sorted = String.valueOf(characters);

            List<String> anagrams = anagramMap.getOrDefault(sorted, new ArrayList<>());
            anagrams.add(str);

            anagramMap.put(sorted, anagrams);
        }

        return new ArrayList<>(anagramMap.values());
    }
}
