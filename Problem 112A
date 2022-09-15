// https://codeforces.com/problemset/problem/112/A
// Petya and Strings

fun main() {
    val line1 = readln().lowercase() // read first string from input, decapitalize
    val line2 = readln().lowercase() // read second string from input, decapitalize
    var more = 0
    var less = 0
    var i = line1.length
    var j = 0
    while (i > 0 && more == 0 && less == 0) { // go through strings elements
        if (line1[j] > line2[j]) { // difference found, print result, exit loop
            println("1")
            more++
        }
        else if (line1[j] < line2[j]){ // difference found, print result, exit loop
            println("-1")
            less++
        }
        else {
            i--
            j++
            if (i == 0) println("0") // end of loop, strings are the same, print result
        }
    }
}
