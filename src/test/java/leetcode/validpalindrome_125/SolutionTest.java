package leetcode.validpalindrome_125;

import static org.assertj.core.api.BDDAssertions.then;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test() {
        then(solution.isPalindrome("A man, a plan, a canal: Panama")).isTrue();
        then(solution.isPalindrome("race a car")).isFalse();
        then(solution.isPalindrome(" ")).isTrue();
    }
}
