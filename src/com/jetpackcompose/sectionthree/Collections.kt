package com.jetpackcompose.sectionthree

fun main() {
    //arrayList()

    //mutableSet()

    mutableMap()

}

private fun arrayList() {
    val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")
    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")
    val arrayPlanet = rockPlanets + gasPlanets
    println(arrayPlanet)
    val solarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")

    println(solarSystem.indexOf("Earth"))
    println(solarSystem.indexOf("Pluto"))//no se encuentra -1

    addElement(solarSystem)
    println()
    for (list in solarSystem) {
        println(list)
    }

    removeListElement(solarSystem)

    printBooleanInList(solarSystem)
}

private fun addElement(solarSystem: MutableList<String>) {
    solarSystem.add("Pluto")
    solarSystem.add(3, "Theia")
    solarSystem[3] = "Future Moon"
    println(solarSystem[3])
    println(solarSystem[9])
}

private fun removeListElement(solarSystem: MutableList<String>) {
    println(solarSystem)
    solarSystem.removeAt(3)
    println(solarSystem)
    solarSystem.remove("Pluto")
    println(solarSystem)
}

private fun printBooleanInList(solarSystem: MutableList<String>) {
    println("Pluto" in solarSystem)
    println(solarSystem.contains("Theia"))
    println(solarSystem.contains("Earth"))
}

private fun mutableSet() {
    val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem.size)
    solarSystem.add("Pluto")
    println(solarSystem.size)
    println(solarSystem.contains("Pluto"))
    println("Pluto" in solarSystem)

    //No se vuelve a agregar debido a que ya existe en el conjunto, el tamaño se mantiene
    solarSystem.add("Pluto")
    println(solarSystem.size)
    solarSystem.remove("Pluto")
    println("Tamaño: "+solarSystem.size+"\nConjunto: "+solarSystem)
    println(solarSystem.contains("Pluto"))
}

private fun mutableMap() {
    val solarSystem = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )
println("Tamaño: "+solarSystem.size)
    println("Se añade Pluto ya que no existe en el mapa")
    solarSystem["Pluto"] = 5
    println("Tamaño: "+solarSystem.size)
    println("Valor de Pluto: "+solarSystem["Pluto"])
    println("Valor de Theia: "+solarSystem.get("Theia"))

    println("método remove")
    solarSystem.remove("Pluto")
    println("Tamaño: "+solarSystem.size)

    println("\nSe actualiza el valor existente de Jupiter")
    //Modificar al valor de Jupiter
    solarSystem["Jupiter"] = 78
    println(solarSystem)
}