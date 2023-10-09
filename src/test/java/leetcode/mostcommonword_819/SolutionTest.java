package leetcode.mostcommonword_819;

import static org.assertj.core.api.BDDAssertions.then;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void mostCommonWordTest() {
        then(solution.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.",
                new String[]{"hit"}))
                .isEqualTo("ball");
    }
}
