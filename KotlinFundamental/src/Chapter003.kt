//TODO: Chapter 003: Type Data: Numbers

fun main() {
    //TODO: Type Data Number: Int, Long, Double, Short, Byte

    var intNumber = 273
    var longNumber = 100
    var doubleNumber = 3.14
    var shortNumber = 10
    var byteNumber = 0b01100100

    println(intNumber)
    println(longNumber)
    println(doubleNumber)
    println(shortNumber)
    println(byteNumber)

    //TODO: Max Min Value Type Data Number
    val intMax = Int.MAX_VALUE
    val intMin = Int.MIN_VALUE

    val longMax = Long.MAX_VALUE
    val longMin = Long.MIN_VALUE

    val doubleMax = Double.MAX_VALUE
    val doubleMin = Double.MIN_VALUE

    val shortMax = Short.MAX_VALUE
    val shortMin = Short.MIN_VALUE

    val byteMax = Byte.MAX_VALUE
    val byteMin = Byte.MIN_VALUE

    println()
    println("Min Max Int = $intMin - $intMax")
    println("Min Max Long = $longMin - $longMax")
    println("Min Max Double = $doubleMin - $doubleMax")
    println("Min Max Short = $shortMin - $shortMax")
    println("Min Max Byte = $byteMin - $byteMax")

    // define value 1000000000000
    val doubleTrilliun: Double = 1000000000000000000000.00
}