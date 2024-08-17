/*fun main() {

    val coins: (Int) -> String = { quantity ->
        "$quantity quarters"
    }

    val treatFunction = trickOrTreat(false, coins)
    val trickFunction = trickOrTreat(true, null)

    treatFunction()
    trickFunction()
}*/

/**
 * Cuando una función tiene un solo parámetro y no proporcionas un nombre,
 * Kotlin le asigna de forma implícita el nombre it, de manera que puedes
 * omitir el nombre del parámetro y el símbolo ->
 */
fun main() {

    /*val coins: (Int) -> String = {
        "$it quarters"
    }*/
    //  Puedes pasar una expresión lambda directamente a una llamada a función
    //val treatFunction = trickOrTreat(false, { "$it quarters" })
    // O
    val treatFunction = trickOrTreat(false) { "$it quarters" }
    val trickFunction = trickOrTreat(true, null)


    /**
     * repeat(times: Int, action: (Int) -> Unit)
     * El parámetro times es la cantidad de veces que debe ocurrir
     * la acción. El parámetro action es una función que toma un
     * solo parámetro Int y muestra un tipo Unit. El parámetro Int
     * de la función action es la cantidad de veces que se ejecutó
     * la acción hasta el momento, como un argumento 0 para la primera
     * iteración o un argumento 1 para la segunda
     */
    repeat(4) {
        treatFunction()
    }
    trickFunction()
}

/**
 * Para declarar una función como anulable, encierra el tipo de función entre paréntesis seguido de un símbolo ?
 */
fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    if (isTrick) {
        return trick
    } else {
        if (extraTreat != null) {
            println(extraTreat(5))
        }
        return treat
    }
}

val trick = {
    println("No treats!")
}

val treat: () -> Unit = {
    println("Have a treat!")
}