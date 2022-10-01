https://leetcode.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate/

class Solution {
    fun nearestValidPoint(x: Int, y: Int, points: Array<IntArray>): Int {
        var tempArray: IntArray
        var validPoints = arrayOf(intArrayOf())
        var indexArr = intArrayOf()
        var dist: Int
        var index = 0

        for (i in points.indices) {
            tempArray = points[i]
            if (tempArray[0] == x || tempArray[1] == y) {
                validPoints += tempArray
                indexArr += i
            }
        }

        if (indexArr.isNotEmpty()) {
            tempArray = validPoints[1]
            dist = abs(tempArray[0] - x) + abs(tempArray[1] - y)
            index = indexArr[0]

            for (i in 1 until validPoints.size) {
                tempArray = validPoints[i]
                if (abs(tempArray[0] - x) + abs(tempArray[1] - y) < dist) {
                    dist = abs(tempArray[0] - x) + abs(tempArray[1] - y)
                    index = indexArr[i-1]
                }
            }
            return index
        }

        else return -1  
    }
    
    fun abs(x: Int): Int {
        return if (x < 0) -x else x
    }
}
