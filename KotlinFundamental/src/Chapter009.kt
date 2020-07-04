//TODO: Chapter 009: Decision Expressions Part 2 ( When )

fun main() {
    //TODO: IF ELSE Expressions
    val number02 = 5
    if (number02 % 2 == 0)
        println("2. $number02 is even number")
    else
        println("2. $number02 is odd number")

    //TODO: When Type 1
    when(number02 % 2) {
        1 -> {
            println("2. $number02 is odd number")
        }
        0 -> {
            println("2. $number02 is even number")
        }
    }

    //TODO: IF ELSEIF ELSE Expressions
    val number03 = 11
    when {
        number03 % 2 == 0 -> println("3. $number03 is multiple by 2")
        number03 % 3 == 0 -> println("3. $number03 is multiple by 3")
        else -> println("3. $number03 isn't multiple by 2 and 3")
    }

    //TODO: IF in IF ( ?? name )
    val number04 = 15
    when {
        number04 % 2 == 0 -> when {
            number04 % 3 == 0 -> println("4. $number04 is multiple by 2 and 3")
            number04 % 5 == 0 -> println("4. $number04 is multiple by 2 and 5")
            else -> println("4. $number04 is multiple by 2")
        }
        number04 % 3 == 0 -> when(number04 % 5) {
            0 -> println("4. $number04 is multiple by 3 and 5")
            else -> println("4. $number04 is multiple by 3")
        }
        else -> println("4. $number04 isn't multiple by 2 and 3")
    }
}