// https://leetcode.com/problems/build-array-from-permutation/

class Solution {
    fun buildArray(nums: IntArray): IntArray {
        var ans = intArrayOf()
        var k: Int
        for (i in nums.indices) {
            k = nums[i]
            ans += nums[k]
        }
        return ans
    }
}
