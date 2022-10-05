https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/

class Solution {
    fun canMakeArithmeticProgression(arr: IntArray): Boolean {
        val arrSort = arr.sorted()
        val d = arrSort[1] - arrSort[0]
        var res = true
        var i = 1
        while (i < arrSort.size) {
            if (arrSort[i-1] + d != arrSort[i]) res = false
            i++
        }
        return res
    }
}
