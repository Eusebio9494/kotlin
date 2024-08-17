/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty


open class SmartDevice protected constructor (val name: String, val category: String) {

    var deviceStatus = "online"
        protected set(value) {
            field = value
        }

    open val deviceType = "unknown"


    open fun turnOn() {
        deviceStatus = "on"
    }

    open fun turnOff() {
        deviceStatus = "off"
    }

    open fun printDeviceInfo(name: String, category: String) {
        println("Device name: $name, category: $category, type: $deviceType")

    }
}


// Declaración de la clase SmartTvDevice con un constructor primario
class SmartTvDevice(deviceName: String, deviceCategory: String) :
// Extiende la clase SmartDevice y pasa los argumentos necesarios a su constructor
    SmartDevice(name = deviceName, category = deviceCategory) {

    // Sobrescribe la propiedad deviceType con un valor específico para SmartTvDevice
    override val deviceType = "Smart TV"

    // Define una propiedad mutable speakerVolume con un setter personalizado
    private var speakerVolume by RangeRegulator(initialValue = 2, minValue = 0, maxValue = 100)



    private var channelNumber by RangeRegulator(initialValue = 1, minValue = 0, maxValue = 200)


    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume.")
    }

    /*protected*/ fun nextChannel() {
        channelNumber++
        println("Channel number increased to $channelNumber.")
    }

    override fun turnOn() {
        super.turnOn()
        println(
            "$name is turned on. Speaker volume is set to $speakerVolume and channel number is " +
                    "set to $channelNumber."
        )
    }

    override fun turnOff() {
        super.turnOff()
        println("$name turned off")
    }

    fun decreaseVolume() {
        speakerVolume--
        println("Speaker volume increased to $speakerVolume.")

    }

    fun previousChannel() {
        channelNumber--
        println("Channel number increased to $channelNumber.")
    }


}

class SmartLightDevice(deviceName: String, categoryName: String): SmartDevice(name = deviceName, category = categoryName) {

    override val deviceType = "Smart Light"

    private var brightnessLevel by RangeRegulator(initialValue = 0, minValue = 0, maxValue = 100)


    fun increaseBrightness() {
        brightnessLevel++
        println("Brightness increased to $brightnessLevel.")
    }

    override fun turnOn() {
        super.turnOn()
        brightnessLevel = 2
        println("$name turned on. The brightness level is $brightnessLevel.")
    }

    override fun turnOff() {
        super.turnOff()
        brightnessLevel = 0
        println("Smart Light turned off")
    }

    fun decreaseBrightness() {
        brightnessLevel--
        println("\"Brightness decreased to $brightnessLevel.\"")
    }

}

class SmartHome(
    val smartTvDevice: SmartTvDevice,
    val smartLightDevice: SmartLightDevice
) {

    var deviceTurnOnCount = 0
        private set


    fun turnTvOn() {
        if (smartTvDevice.deviceStatus.equals("off")) {
            smartTvDevice.turnOn()
            deviceTurnOnCount++
        }

    }

    fun turnOffTv() {
        if (smartTvDevice.deviceStatus.equals("on")) {
            deviceTurnOnCount--
            smartTvDevice.turnOff()
        }
    }

    fun increaseTvVolume() {
        if (smartTvDevice.deviceStatus.equals("on")) {
            smartTvDevice.increaseSpeakerVolume()
        }
    }

    fun changeTvChannelToNext() {
        if (smartTvDevice.deviceStatus.equals("on")) {
            smartTvDevice.nextChannel()
        }
    }

    fun turnOnLight() {
        if (smartLightDevice.deviceStatus.equals("off")) {
            deviceTurnOnCount++
            smartLightDevice.turnOn()
        }
    }

    fun turnOffLight() {
        if (smartLightDevice.deviceStatus.equals("on")) {
            deviceTurnOnCount--
            smartLightDevice.turnOff()
        }
    }

    fun increaseLightBrightness() {
        if (smartLightDevice.deviceStatus.equals("on")) {
            smartLightDevice.increaseBrightness()
        }
    }

    fun turnOffAllDevices() {
        turnOffTv()
        turnOffLight()
    }

    fun decreaseTvVolume() {
        smartTvDevice.decreaseVolume()

    }
    fun changeTvChannelToPrevious() {
        smartTvDevice.previousChannel()
    }
    fun printSmartTvInfo(name: String, category: String) {
        smartTvDevice.printDeviceInfo(name,category)

    }
    fun printSmartLightInfo(name: String, category: String) {
        smartLightDevice.printDeviceInfo(name, category)
    }

    fun decreaseLightBrightness() {
        if (smartLightDevice.deviceStatus == "on") {
            smartLightDevice.decreaseBrightness()
        }

    }

}

fun main() {
//    var smartTvDevice: SmartDevice = SmartTvDevice("Android TV", "Entertainment")
//    smartTvDevice.turnOn()

    var smartTvDevice = SmartTvDevice("Android TV", "Entertainment")
    smartTvDevice.turnOn()

    var smartLightDevice = SmartLightDevice("Google Light", "Utility")
    smartLightDevice.turnOn()


    val smartHome = SmartHome(smartTvDevice, smartLightDevice)
    smartHome.decreaseTvVolume()
    smartHome.changeTvChannelToPrevious()
    smartHome.printSmartTvInfo(name = "GoogleTV", category = "Entretenimiento")
    smartHome.printSmartLightInfo(name = "Alexa Light Kitchen", category = "Utility")
    smartHome.decreaseLightBrightness()


}



class RangeRegulator(
    initialValue: Int,
    private val minValue: Int,
    private val maxValue: Int
) : ReadWriteProperty<Any?, Int> {

    var fieldData = initialValue

    override fun getValue(thisRef: Any?, property: KProperty<*>) : Int {
        return fieldData

    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        if (value in minValue..maxValue) {
            fieldData = value
        }

    }

}
