//TODO: Chapter 005: Character and String

fun main() {
    //TODO: Character

    //TODO: 1. Just using ''
    val charOne = 'K' // not 'KLM' -> error

    //TODO: 2. You can using ++ or --
    var charTwo = 'E'
    println(charTwo)
    println(charTwo++)
    println(charTwo++)
    println(charTwo--)
    println(charTwo--)

    //TODO: String
    //TODO: String using ""

    val StringOne = "Algokelvin"
    val StringTwo = "273"
    val StringThree = "K"
    val StringFour = "false"

    println()
    println(StringOne)
    println(StringTwo)
    println(StringThree)
    println(StringFour)

    //You can every character in String
    //TODO: I using StringOne
    println()
    println(StringOne[0])
    println(StringOne[1])
    println(StringOne[2])
    println(StringOne[3])
    println(StringOne[4])
    println(StringOne[StringOne.length-1])
    println(StringOne[StringOne.lastIndex])

    //You can loop String to get every char
    println()
    for (char in StringOne) {
        print("$char ")
    }
}