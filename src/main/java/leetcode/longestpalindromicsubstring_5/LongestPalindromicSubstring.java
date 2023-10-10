package leetcode.longestpalindromicsubstring_5;

/**
 * https://leetcode.com/problems/longest-palindromic-substring
 */
public class LongestPalindromicSubstring {

    int left;
    int maxLength;

    public void extendPalindrome(String str, int j, int k) {
        while (j >= 0 && k < str.length()
                && str.charAt(j) == str.charAt(k)) {
            j--;
            k++;
        }

        if (maxLength < k - j - 1) {
            left = j + 1;
            maxLength = k - j - 1;
        }
    }

    public String longestPalindrome(String s) {
        int length = s.length();

        if (length < 2) {
            return s;
        }

        for (int i = 0; i < length - 1; i++) {
            extendPalindrome(s, i, i + 1);
            extendPalindrome(s, i, i + 2);
        }

        return s.substring(left, left + maxLength);
    }
}
