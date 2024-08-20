package com.jetpackcompose.sectionthree

class Collections {

}

fun main() {
    var rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")
    var gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")

    val solarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")

    println(solarSystem.indexOf("Earth"))
    println(solarSystem.indexOf("Pluto"))//no se encuentra -1

    addElement(solarSystem)
    println()
    for(list in solarSystem) {
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