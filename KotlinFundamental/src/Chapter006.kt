//TODO: Chapter 006: Nullable Types, Safe Call, Elvis Operator

fun main() {
    //TODO: Nullable Integer
    val intNull: Int? = null
    println(intNull)

    //TODO: Nullable String
    val stringNull: String? = "Algokelvin"
    //println(stringNull!!.length) // using !! -> not recommended
    println(stringNull?.length) // using ?. -> Safe Calls

    //using elvis operator
    println(stringNull?.length ?: "no value")

    //using if
    if (stringNull != null) println(stringNull)
    else println("no value again")
}