//TODO: Chapter 004: Type Data Boolean

fun main() {
    /*
    3 Type Data Boolean:
    - Conjunction ( AND ) -> &&
    - Disjunction ( OR ) -> ||
    - Negation ( NOT ) -> !
     */

    val a = true
    val b = false

    //TODO: Conjunction ( && )
    println("Conjunction")
    println(a && a)
    println(a && b)
    println(b && a)
    println(b && b)
    println()

    //TODO: Disjunction ( || )
    println("Disjunction")
    println(a || a)
    println(a || b)
    println(b || a)
    println(b || b)
    println()

    //TODO: Negation ( ! )
    println("Negation")
    println(!a)
    println(!b)
}