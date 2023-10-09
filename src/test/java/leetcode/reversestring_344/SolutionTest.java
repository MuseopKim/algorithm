package leetcode.reversestring_344;

import static org.assertj.core.api.BDDAssertions.then;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void reverseStringTest() {
        then(solution.reverseString(new char[]{'h', 'e', 'l', 'l', 'o'})).isEqualTo("olleh");
        then(solution.reverseString(new char[]{'H', 'a', 'n', 'n', 'a', 'h'})).isEqualTo("hannaH");
    }

    @Test
    void solution1Test() {
        then(solution.solution1(new char[]{'h', 'e', 'l', 'l', 'o'})).isEqualTo("olleh");
        then(solution.solution1(new char[]{'H', 'a', 'n', 'n', 'a', 'h'})).isEqualTo("hannaH");
    }
}
