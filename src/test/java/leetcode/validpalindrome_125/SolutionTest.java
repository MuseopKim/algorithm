package leetcode.validpalindrome_125;

import static org.assertj.core.api.BDDAssertions.then;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isPalindromeTest() {
        then(solution.isPalindrome("A man, a plan, a canal: Panama")).isTrue();
        then(solution.isPalindrome("race a car")).isFalse();
        then(solution.isPalindrome(" ")).isTrue();
    }

    @Test
    void solution1Test() {
        then(solution.solution1("A man, a plan, a canal: Panama")).isTrue();
        then(solution.solution1("race a car")).isFalse();
        then(solution.solution1(" ")).isTrue();
    }

    @Test
    void solution2Test() {
        then(solution.solution2("A man, a plan, a canal: Panama")).isTrue();
        then(solution.solution2("race a car")).isFalse();
        then(solution.solution2(" ")).isTrue();
    }
}
