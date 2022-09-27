https://leetcode.com/problems/palindrome-number/

class Solution {
    fun isPalindrome(x: Int): Boolean {
        val nums = x.toString()
        val len = nums.length
        val str1: String
        val str2: String
        val ans: Boolean
        
        if (x > 9) {
            if (len % 2 == 0) {
                str1 = nums.substring(0 until len / 2)
                str2 = nums.substring(len / 2).reversed()
            } else {
                str1 = nums.substring(0 until len / 2)
                str2 = nums.substring(len / 2 + 1).reversed()
            }
            ans = str1.toInt() == str2.toInt()
        } else ans = x >= 0
        
        return ans
    }
}
