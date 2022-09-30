https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

class Solution {
    fun subtractProductAndSum(n: Int): Int {
        var prod = 1
        var sum = 0
        for (ch in n.toString()) {
            prod *= (ch.toInt() - 48) // 48 is code for '0'
            sum += (ch.toInt() - 48)
        }
        
        return prod - sum
    }
}
