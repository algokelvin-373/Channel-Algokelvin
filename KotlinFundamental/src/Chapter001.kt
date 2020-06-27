//TODO: Chapter 001: Data Identifier

fun main() {
    //TODO: val and var

    //val
    println("Data01")
    val data01 = "Kotlin"
    println(data01)
    println()

    // var
    println("Data02")
    var data02 = "Java"
    println(data02)
    data02 = "Kotlin"
    println(data02)
    println()

    //TODO: Data Identifier ( variable identifier: type data = initializer )

    val type01 = "Algokelvin" // ( variable, identifier, initializer )
    val type02: String = "Kotlin" // ( variable, identifier, type data, initializer )
    var type03: Int // ( variable, identifier, type data )
    type03 = 273
    println(type01)
    println(type02)
    println(type03)
}