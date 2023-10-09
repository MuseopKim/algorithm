package leetcode.reorderdatainlogfiles_937;

import static org.assertj.core.api.BDDAssertions.then;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private Solution solution = new Solution();

    @Test
    void reorderLogFilesTest() {
        String[] result = solution.reorderLogFiles(
                new String[]{"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"});
        String[] expected = new String[]{"let1 art can", "let3 art zero", "let2 own kit dig", "dig1 8 1 5 1", "dig2 3 6"};

        then(Arrays.equals(result, expected)).isTrue();
    }
}
