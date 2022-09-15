// https://codeforces.com/problemset/problem/263/A
// Beautiful Matrix

fun abs(x: Int): Int { // get absolute value
    return if (x < 0) -x else x
}

fun main() {
    // positions in rows and columns are indexed as: [-2 -1 0 1 2]
    var i = -2 // initial position in column
    var j = -2 // initial position in row
    var line = ""
    var k = 1 // first element in line

    repeat(5) {// read 5 strings from input
        val next = readln()
        line += next.filter{it.isDigit()} // add to line, keep digits only
    }

    val line1 = line.split("") // convert string to array
    var len = line.length

    while (len > 0 && line1[k].toInt() != 1) { // go through elements till "1" is found
        i++ // move to next column
        if (i == 3) { // reached end of row
            j++ // move to next row
            i = -2 // reset to initial position in column
        }
        len--
        k++
    }

    println(abs(i) + abs(j))
}
