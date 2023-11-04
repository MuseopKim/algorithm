package leetcode.validparentheses_20;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class ValidParentheses {

    public boolean isValid(String s) {
        int length = s.length();

        if (length < 2) {
            return false;
        }

        Map<Character, Character> pairs = Map.of(
                ']', '[',
                '}', '{',
                ')', '('
        );

        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < length; i++) {
            if (!pairs.containsKey(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else if (stack.isEmpty() || pairs.get(s.charAt(i)) != stack.pop()) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
