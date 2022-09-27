https://leetcode.com/problems/shortest-completing-word/

class Solution {
    fun shortestCompletingWord(licensePlate: String, words: Array<String>): String {
        val licensePlate1 = licensePlate.filter { it.isLetter() }.toLowerCase().split("")
        val clear = licensePlate1.slice(1 until licensePlate1.size - 1)
        var clear1 = clear
        var wordLen = 20
        var ans = ""
        var middle = ""
        var another = listOf<String>()

    if (clear.size == 1) {
        for (i in words.indices) {
            middle = words[i]

            if (middle.split("").containsAll(clear) && wordLen > middle.length) {
                wordLen = middle.length
                ans = words[i]
            }
        }
    } else {
        for (i in words.indices) {
            if (words[i].split("").containsAll(clear)) {
                another = another.plus(words[i])
            }
        }
        for (i in another.indices) {
            middle = another[i]
            clear1 = clear
            var middle1 = middle
            while (middle1.isNotEmpty() && clear1.isNotEmpty() && middle1.split("").containsAll(clear1)) {
                middle1 = middle1.replaceFirst(clear1[0],"")
                clear1 = clear1.drop(1)
                if (clear1.isEmpty()) {
                    if (wordLen > middle1.length) {
                        wordLen = middle1.length
                        ans = another[i]}
                }
            }
        }

    }
        
        return ans
    }
}
