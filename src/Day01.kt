fun main() {
    val input = readInput("Day01")
    var largerMeasurement : Int = 0
    var previousNumber = input[0].toInt()
    for (i in input){
        val number = i.toInt()
        if(previousNumber<number)
            largerMeasurement++
        previousNumber=number
    }
    println(largerMeasurement)
}
