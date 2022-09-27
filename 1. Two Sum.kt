https://leetcode.com/problems/two-sum/

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var ans = intArrayOf()
        var index1 = 0
        var index2 = 0

        for (i in nums.indices) {
            for (j in nums.indices) {
                if ( i != j && nums[i] + nums[j] == target) {
                    index1 = i
                    index2 = j
                }
            }
        }

        ans = if (index2 > index1) ans + index1 + index2 else ans + index2 + index1

        return ans
    }
}
