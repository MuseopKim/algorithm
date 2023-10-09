package leetcode.reversestring_344;

/**
 * https://leetcode.com/problems/reverse-string/
 */
public class Solution {

    public String reverseString(char[] s) {
        int length = s.length;
        int left = 0;
        int right = length - 1;

        char[] reversed = new char[length];
        while (left <= right) {
            if (left == right) {
                reversed[left] = s[right];
                break;
            }

            reversed[left] = s[right];
            reversed[right] = s[left];

            left++;
            right--;
        }

        return String.valueOf(reversed);
    }

    // swap
    public String solution1(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }

        return String.valueOf(s);
    }
}
