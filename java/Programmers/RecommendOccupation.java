package Programmers;

import java.util.*;

public class RecommendOccupation {

    static String solution(String[] table, String[] languages, int[] preference) {
        HashMap<String, HashMap<String, Integer>> industries = new HashMap<>();

        for (String detail : table) {
            String[] toBeReversed = Arrays.copyOfRange(detail.split(" "), 1, detail.split(" ").length);
            List<String> tempList = Arrays.asList(toBeReversed);
            Collections.reverse(tempList);
            String[] langs = tempList.toArray(toBeReversed);

            String[] industry = detail.split(" ");
            String industryName = industry[0];

            industries.put(industryName, new HashMap<>());

            for (int i = 0; i < langs.length; i++) {
                industries.get(industryName).put(langs[i], i + 1);
            }
        }

        int length = languages.length;
        int max = 0;
        String result = "zzzzz";

        for (String industry : industries.keySet()) {
            int score = 0;
            Map<String, Integer> scores = industries.get(industry);

            for (int i = 0; i < length; i++) {
                String language = languages[i];
                int preferenceScore = preference[i];
                score += scores.getOrDefault(language, 0) * preferenceScore;
            }

            if (score > max) {
                max = score;
                result = industry;
            }

            if (score == max) {
                int compare = industry.compareTo(result);

                if (compare < 0) {
                    max = score;
                    result = industry;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] table = new String[] {"SI JAVA JAVASCRIPT SQL PYTHON C#",
                "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++",
                "HARDWARE C C++ PYTHON JAVA JAVASCRIPT",
                "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP",
                "GAME C++ C# JAVASCRIPT C JAVA"};
        String[] languages = new String[] { "PYTHON", "C++", "SQL" };
        int[] preference = new int[] { 7, 5, 5 };

        System.out.println(solution(table, languages, preference));
    }
}
