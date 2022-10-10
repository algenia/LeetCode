https://leetcode.com/problems/happy-number/

import kotlin.math.pow

class Solution {
    fun isHappy(n: Int): Boolean {
        var happyN = 0
        var sadN = 0
        var x = 0
        var x2 = 0
        var x3 = 0.0
        var strN = n.toString()
        var numCount = strN.length
        var loopArr = intArrayOf()

        while (sadN != n && happyN != 1) {
            while (numCount != 0) {
                x2 = strN[numCount - 1].toInt() - 48
                x3 = x2.toDouble().pow(2)
                x += x3.toInt()
                numCount --
            }
            happyN = x
            sadN = x
            if (x in loopArr) break else loopArr += x
            numCount = x.toString().length
            strN = x.toString()
            x = 0
        }
        return happyN == 1
        
    }
}
