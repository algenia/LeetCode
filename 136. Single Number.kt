https://leetcode.com/problems/single-number/

class Solution {
    fun singleNumber(nums: IntArray): Int {
        var ans = nums.sorted()

        return if (ans.size == 1) ans[0]
        else {
            while (ans.size > 1 && ans[ans.size - 1] == ans[ans.size - 2]) {
                ans = ans.dropLast(2)
            }
            ans[ans.size-1]
        }
    }
}
