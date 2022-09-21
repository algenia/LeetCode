// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/

class Solution {
    fun finalValueAfterOperations(operations: Array<String>): Int {
        var x = 0
        for (n in operations.indices) {
            if (operations[n].contains("+")) x++ else x--
        }
        return x
    }
}
