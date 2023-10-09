package leetcode.reorderdatainlogfiles_937;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/reorder-data-in-log-files
 */
public class Solution {

    public String[] reorderLogFiles(String[] logs) {
        List<String> letterLogs = new ArrayList<>();
        List<String> numberLogs = new ArrayList<>();

        for (String log : logs) {
            if (Character.isDigit(log.split(" ")[1].charAt(0))) {
                numberLogs.add(log);
            } else {
                letterLogs.add(log);
            }
        }

        Collections.sort(letterLogs, (log1, log2) -> {
            String[] log1Elements = log1.split(" ", 2);
            String[] log2Elements = log2.split(" ", 2);

            int compared = log1Elements[1].compareTo(log2Elements[1]);

            if (compared == 0) {
                return log1Elements[0].compareTo(log2Elements[0]);
            }

            return compared;
        });

        letterLogs.addAll(numberLogs);

        return letterLogs.toArray(String[]::new);
    }
}
