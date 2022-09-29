https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/

class Solution {
    fun average(salary: IntArray): Double {
        val arr = salary.filter { it != salary.max() && it != salary.min() }
        val avr = arr.average()
        val ans = "%.5f".format(avr)

        return ans.toDouble()
    }
}
