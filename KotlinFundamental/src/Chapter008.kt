//TODO: Chapter 008: Decision Expressions Part 1 ( IF ELSE )

fun main() {
    //TODO: IF Expressions
    val number01 = 4
    if (number01 % 2 == 0)
        println("1. $number01 is even number")

    //TODO: IF ELSE Expressions
    val number02 = 5
    if (number02 % 2 == 0)
        println("2. $number02 is even number")
    else
        println("2. $number02 is odd number")

    //TODO: IF ELSEIF ELSE Expressions
    val number03 = 11
    if (number03 % 2 == 0) println("3. $number03 is multiple by 2")
    else if (number03 % 3 == 0) println("3. $number03 is multiple by 3")
    else println("3. $number03 isn't multiple by 2 and 3")

    //TODO: IF in IF ( ?? name )
    val number04 = 6
    if (number04 % 2 == 0) {
        if (number04 % 3 == 0) {
            println("4. $number04 is multiple by 2 and 3")
        }
        else if (number04 % 5 == 0) {
            println("4. $number04 is multiple by 2 and 5")
        }
        else {
            println("4. $number04 is multiple by 2")
        }
    }
    else if (number04 % 3 == 0) {
        if (number04 % 5 == 0) println("4. $number04 is multiple by 3 and 5")
        else println("4. $number04 is multiple by 3")
    }
    else println("4. $number04 isn't multiple by 2 and 3")
}