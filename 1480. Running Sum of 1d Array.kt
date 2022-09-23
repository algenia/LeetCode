// https://leetcode.com/problems/running-sum-of-1d-array/

class Solution {
    fun runningSum(nums: IntArray): IntArray {
        var ans = intArrayOf(nums[0])
        var k: Int
        for (i in 0 until (nums.size - 1)) {
            k = ans[i] + nums[i+1]
            ans += k
        }
        return ans
    }
}
