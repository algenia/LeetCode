https://leetcode.com/problems/check-if-word-equals-summation-of-two-words/

class Solution {
    fun isSumEqual(firstWord: String, secondWord: String, targetWord: String): Boolean {
        fun toNum(str: String): String {
            var ans = ""
            for (char in str.indices) ans += (str[char].toInt() - 97).toString()
            return ans
        }
        
        return toNum(firstWord).toInt() + toNum(secondWord).toInt() == toNum(targetWord).toInt()
    }
}
