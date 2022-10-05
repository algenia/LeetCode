https://leetcode.com/problems/sign-of-the-product-of-an-array/

class Solution {
    fun arraySign(nums: IntArray): Int {
        return if (nums.contains(0)) 0
        else if (nums.filter { it < 0 }.size % 2 == 0) 1
        else -1
    }
}
