class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {


    fun showProfile() {
        val currentReferrer = referrer
        val referrer: String
        if (currentReferrer != null) {
            referrer = "Has a referrer named ${currentReferrer.name}, who likes to ${currentReferrer.hobby}."
        } else {
            referrer = "Doesn't have a referrer."
        }
        println("Name:  $name\nAge: $age\nLikes to $hobby. $referrer\n")
    }
}

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()

   // atiqah.showFullReferralChain() // Output: Name: Atiqah -> Referrer: Amanda
}

/*
fun Person.showFullReferralChain() {
    print("Name: $name")
    var currentReferrer = referrer
    while (currentReferrer != null) {
        print(" -> Referrer: ${currentReferrer.name}")
        currentReferrer = currentReferrer.referrer
    }
    println()
}
*/


