package leetcode.validpalindrome_125;

/**
 * https://leetcode.com/problems/valid-palindrome/
 */
public class Solution {

    public boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);

            if (!Character.isLetterOrDigit(character)) {
                continue;
            }

            builder.append(Character.toLowerCase(character));
        }

        String trimmed = builder.toString();
        int length = trimmed.length();

        int left = 0;
        int right = length - 1;

        while (left <= right) {
            char leftCharacter = trimmed.charAt(left);
            char rightCharacter = trimmed.charAt(right);

            if (leftCharacter != rightCharacter) {
                return false;
            }

            left += 1;
            right -= 1;
        }

        return true;
    }

    public boolean solution1(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            } else if (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            } else {
                if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                    return false;
                }

                start++;
                end--;
            }

        }

        return true;
    }

    public boolean solution2(String s) {
        String filtered = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(filtered).reverse().toString();

        return filtered.equals(reversed);
    }
}
