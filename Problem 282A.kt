// https://codeforces.com/problemset/problem/282/A
// Bit++

fun main() {
    var n = readln().toInt() // read number of sentences from input
    var x = 0
    while (n > 0) { // read n lines
        val next = readln()
        if (next[1].compareTo('+') == 0) x++ // increase x if second character in line is +
        else x-- // decrease x if second character in line is not +
        n--
    }
    println(x)
}
