https://leetcode.com/problems/largest-perimeter-triangle/

class Solution {
    fun largestPerimeter(nums: IntArray): Int {
        val arr = nums.sortedArrayDescending()
        var x = 0
        var y = 0
        var z = 0
        var sum = 0

        for (i in 3..arr.size) {
            x = arr[i - 3]
            y = arr[i - 2]
            z = arr[i - 1]
            if (x < (y + z) && y < (x + z) && z < (x + y) && sum < x + y + z) sum = x + y + z
        }
        
        return sum
    }
}
