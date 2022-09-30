https://leetcode.com/problems/number-of-1-bits/

class Solution {
    fun hammingWeight(n:Int):Int {
        val str = Integer.toBinaryString(n).filter { it == '1' }

        return str.length
    }
}
