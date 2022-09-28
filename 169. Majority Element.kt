https://leetcode.com/problems/majority-element/

class Solution {
    fun majorityElement(nums: IntArray): Int {
        val map = nums.toList().groupingBy { it }.eachCount()
        val str = map.maxBy { it.value }.toString()
        val res = str.substringBefore('=').toInt()

        return res
    }
}
