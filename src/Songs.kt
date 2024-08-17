class Song(artista: String, titulo: String, anio: Int, counterReproduction: Int) {


    var popuparSong: Boolean = false

    fun printInfo(titulo: String, artista: String, anio: Int, counterReproduction: Int) {
        if (counterReproduction > 1000) {
            popuparSong = true
            println("Es popular: $popuparSong")
        }
        println("$titulo, interpretada por $artista, se lanzó en $anio.")
    }

}

fun main() {
    val cancion = Song("Juanes","La camisa negra", 2008, 500000)


    cancion.printInfo(artista = "Juanes", titulo = "La camisa negra", anio = 2008, counterReproduction = 500000)
}

