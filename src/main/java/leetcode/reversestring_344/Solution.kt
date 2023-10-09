package leetcode.reversestring_344

fun reverseString(s: CharArray): Unit {
    var start = 0
    var end = s.size - 1

    while (start < end) {
        // also를 사용하면 모든 연산이 진행되기 전에는 값이 변하지 않는다.
        s[start] = s[end].also { s[end] = s[start] }

        start++
        end--
    }
}
