fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    var price = 0
     when {
        age <= 12 -> price = 15
        age in 13..60 -> if (isMonday) price = 30 else price = 25
        age in 61..100 -> price = 20
        else -> {
            println("The person enter in Free")
        }
    }
    return price
}
