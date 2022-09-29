https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/

class Solution {
    fun countOdds(low: Int, high: Int): Int {
        var count = 0
        for (i in low..high) {
            if (i % 2 != 0) count++
        }

        return count
    }
}
