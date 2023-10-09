package leetcode.groupanagrams_49

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val results: MutableMap<String, MutableList<String>> = mutableMapOf()

    for (str in strs) {
        val sorted = str.toCharArray().sorted().joinToString("")

        results.getOrPut(sorted) { mutableListOf() }

        results[sorted]!!.add(str)
    }

    return ArrayList<List<String>>(results.values)
}
