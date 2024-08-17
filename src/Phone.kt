open class Phone(var isScreenLightOn: Boolean = false){

    fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.\n")
    }
}

class FoldablePhone() : Phone(isScreenLightOn = false) {

    /**
     * Una propiedad que indique si el teléfono está plegado
     */
    var foldablePhone: Boolean = false

    /**
     * Un comportamiento de función switchOn() diferente del de la clase Phone para que solo encienda la pantalla cuando el teléfono no esté plegado
     */
    fun switchScreenOnPhone(foldablePhone: Boolean) {
        if (!foldablePhone) {
            switchOn()
        } else {
            switchOff()
        }
    }

    /**
     * Métodos para cambiar el estado de plegado
     */
    fun foldableOn() {
        foldablePhone = false
        switchScreenOnPhone(foldablePhone)
        println("El telefono no está plegado")

    }

    fun foldableOff() {
        foldablePhone = true
        switchScreenOnPhone(foldablePhone)
        println("El telefono está plegado")

    }
}

fun main() {
    val phone = FoldablePhone()

    phone.foldableOn()
    phone.checkPhoneScreenLight()

    phone.foldableOff()
    phone.checkPhoneScreenLight()
}

