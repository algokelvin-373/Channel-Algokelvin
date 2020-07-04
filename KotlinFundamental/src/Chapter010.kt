//TODO: Chapter 010: Introduction of Function or Method

fun main() {
    /*
    Modelling of Function

    TODO: | fun nameFunction(param1: Type1, param2: Type2, ...): ReturnType {
    TODO: |   // to do
    TODO: |   return type data
    TODO: | }

     */

    //TODO: Function 1: Plus with 2 number
    plusNumber(4, 5)

    //TODO: Function 2: Minus with 2 number with return data
    val data = minusNumber(7, 4)
    println(data)

    //TODO: Function 3: just call function
    getMessage()
}

//TODO: with 2 parameter without return type
fun plusNumber(a: Int, b: Int) {
    println(a + b)
}

//TODO: with 2 parameter with return type
fun minusNumber(a: Int, b: Int): Int {
    return a - b
}

//TODO: no parameter, no return data
fun getMessage() {
    println("Algokelvin")
}