https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/

class Solution {
    fun areAlmostEqual(s1: String, s2: String): Boolean {
        var subS1 = ""
        var subS2 = ""

        for (char in s1.indices) {
            if (s1[char] != s2[char]) {
                subS1 += s1[char]
                subS2 += s2[char]
            }
        }

        return if (subS1 == "") true
        else (subS1.length == 2 && subS1.toSortedSet() == subS2.toSortedSet())
    }
}
