package day3

import readInput

fun main() {
    val input = readInput("day3/Day03")
    val gammaRate = IntArray(12)
    val epsilonRate = IntArray(12)
    for (index in 0..11) {
        var oneCount = 0
        var zeroCount = 0
        for (i in input) {
            if (i[index].code == 49) {
                oneCount++
            }
            if (i[index].code == 48) {
                zeroCount++
            }
        }
        if (oneCount > zeroCount) {
            gammaRate[index] = 1
            epsilonRate[index] = 0
        } else {
            gammaRate[index] = 0
            epsilonRate[index] = 1
        }
    }
    var gammaTemp: Long = 0;
    var epsilonTemp: Long = 0;
    for (j in gammaRate) {
        gammaTemp *= 10
        gammaTemp += j
    }
    for (k in epsilonRate) {
        epsilonTemp *= 10
        epsilonTemp += k
    }
    val gammaRateInteger = convertBinaryToDecimal(gammaTemp)
    val epsilonRateInteger = convertBinaryToDecimal(epsilonTemp)

    println(gammaRateInteger * epsilonRateInteger)

}

fun convertBinaryToDecimal(num: Long): Int {
    var num = num
    var decimalNumber = 0
    var i = 0
    var remainder: Long

    while (num.toInt() != 0) {
        remainder = num % 10
        num /= 10
        decimalNumber += (remainder * Math.pow(2.0, i.toDouble())).toInt()
        ++i
    }
    return decimalNumber
}