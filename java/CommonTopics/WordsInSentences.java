package CommonTopics;

import java.util.Scanner;

public class WordsInSentences {

    static String findLongestWords(String str) {
        String longestWord = "";
        String[] words = str.split(" ");

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String str = stdIn.nextLine();
        System.out.println(findLongestWords(str));
    }

    static String findByIndexOf(String str) {
        String longestWord = "";
        int longestLength = Integer.MIN_VALUE;

        int position;

        while ((position = str.indexOf(' ')) != -1 ) {
            String tempStr = str.substring(0, position);
            int length = tempStr.length();
            if (length > longestLength) {
                longestLength = length;
                longestWord = tempStr;
            }
            str = str.substring(position + 1);
        }

        if (str.length() > longestLength) {
            longestWord = str;
        }

        return longestWord;
    }
}
