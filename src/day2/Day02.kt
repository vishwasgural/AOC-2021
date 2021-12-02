package day2

import readInput

fun main() {
    val input = readInput("day2/Day02")
    var depth = 0
    var forward = 0
    var aim = 0
    for (i in input) {
        var moment = i.split(' ')
        if (moment[0] == "forward"){
            forward += moment[1].toInt()
            var temp = moment[1].toInt() * aim
            depth += temp
        }
        else if(moment[0] == "down") {
            aim += moment[1].toInt()}

        else if(moment[0] == "up") {
            aim -= moment[1].toInt()
        }
    }
    println(depth * forward)
}
