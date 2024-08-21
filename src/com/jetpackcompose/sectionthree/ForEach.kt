package com.jetpackcompose.sectionthree

class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)

val cookies = listOf(
    Cookie(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie(
        name = "Banana Walnut",
        softBaked = true,
        hasFilling = false,
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)

fun main() {
    println("Mostrar lista de cookies con for each")
    cookies.forEach {
        println("Menu item: ${it.name} - ${it.price}")
    }

    println("\nCrear mapa a partir de la lista de cookies y mostrar con for each")
    val fullMenu = cookies.map {
        "${it.name} - $${it.price}"
    }
    println("\nFull menu:")
    fullMenu.forEach {
        println(it)
    }

    println("\nfunción filter()")
    val softBakedMenu = cookies.filter {
        it.softBaked
    }
    println("\nSoft cookies:")
    softBakedMenu.forEach {
        println("${it.name} - $${it.price}")
    }




}

