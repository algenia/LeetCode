https://leetcode.com/problems/merge-strings-alternately/

class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        var res = ""

        if (word1.length < word2.length) {
            for (char in word1.indices) {
                res += word1[char]
                res += word2[char]
            }
            res += word2.substring(word1.length)
        } else if (word1.length > word2.length) {
            for (char in word2.indices) {
                res += word1[char]
                res += word2[char]
            }
            res += word1.substring(word2.length)
        } else {
            for (char in word1.indices) {
                res += word1[char]
                res += word2[char]
            }
        }
        return res
    }
}
