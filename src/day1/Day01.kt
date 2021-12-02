package day1

import readInput

fun main() {
    val input = readInput("day1/Day01")
    var largerMeasurement = 0
    var firstNumber = input[0].toInt()
    var secondNumber = input[1].toInt()
    var thirdNumber = input[2].toInt()
    var firstSum: Int = firstNumber + secondNumber + thirdNumber
    for (i in input) {
        val number = i.toInt()
        val secondSum = number + secondNumber + thirdNumber
        if (firstSum < secondSum)
            largerMeasurement++
        firstNumber = secondNumber
        secondNumber = thirdNumber
        thirdNumber = number
        firstSum = firstNumber + secondNumber + thirdNumber
    }
    println(largerMeasurement)
}
