# Main.kt
    OOP consta de cuatro principios principales: encapsulamiento, abstracción, herencia y polimorfismo.
    Las clases se definen con la palabra clave class y contienen propiedades y métodos.
    Las propiedades son similares a las variables, excepto que pueden tener métodos get y set personalizados.
    Un constructor especifica cómo crear instancias de los objetos de una clase.
    Puedes omitir la palabra clave constructor cuando defines un constructor principal.
    La herencia facilita la reutilización de código.
    La relación IS-A se refiere a la herencia.
    La relación HAS-A se refiere a la composición.
    Los modificadores de visibilidad son importantes para lograr el encapsulamiento.
    Kotlin ofrece cuatro modificadores de visibilidad: public, private, protected y internal.
    Un delegado de propiedad te permite reutilizar el código get y set en varias clases.
# Lambda.Kt

    Las funciones en Kotlin son construcciones de primer nivel y se pueden tratar como tipos de datos.
    Las expresiones lambda proporcionan una sintaxis abreviada para escribir funciones.
    Puedes pasar tipos de funciones a otras funciones.
    Puedes mostrar un tipo de función desde otra.
    Una expresión lambda muestra el valor de la última expresión.
    Si se omite una etiqueta de parámetro en una expresión lambda con un solo parámetro, se hace referencia a ella con el identificador it.
    Las expresiones lambda se pueden escribir intercaladas sin un nombre de variable.
    Si el último parámetro de una función es un tipo de función, puedes usar la sintaxis lambda al final para mover la expresión lambda después del último paréntesis cuando llamas a una función.
    Las funciones de orden superior son funciones que toman otras funciones como parámetros o muestran una función.
    La función repeat() es una función de orden superior que funciona de manera similar a un bucle for.

# FillInTheBlankQuestion

    Cuando una clase se define como una clase de datos, se implementan los siguientes métodos:
    equals()
    hashCode() (verás este método cuando trabajes con ciertos tipos de colecciones)
    toString()
    componentN(): component1(), component2(), etc.
    copy()

## Singleton; Hay muchas situaciones en las que querrás que una clase tenga solo una instancia. Por ejemplo:

    Estadísticas del jugador actual en un juego para dispositivos móviles
    Interacciones con un solo dispositivo de hardware, como enviar audio a través de una bocina
    Un objeto para acceder a una fuente de datos remota (como una base de datos de Firebase)
    Autenticación, en función de la cual solo debe acceder un usuario a la vez

Objeto Singleton
En las situaciones anteriores, es probable que necesites usar una clase. Sin embargo, solo necesitarás una instancia 
de esa clase. Si solo hay un dispositivo de hardware o si accedió solo un usuario a la vez, no habrá motivo para crear 
más de una instancia. Tener dos objetos que acceden al mismo dispositivo de hardware de forma simultánea podría causar un comportamiento muy extraño y con errores.

Puedes comunicar claramente en tu código que un objeto debe tener una sola instancia definiéndolo como un singleton. 
Un singleton es una clase que solo puede tener una única instancia. Kotlin proporciona una construcción especial, llamada objeto, 
que se puede usar para crear una clase singleton.

### Ejemplo:

object StudentProgress {
var total: Int = 10
var answered: Int = 3
}


Objeto Complementario
Las clases y los objetos de Kotlin se pueden definir dentro de otros tipos y pueden ser una excelente manera de organizar tu código. 
Puedes definir un objeto singleton dentro de otra clase por medio de un objeto complementario. Un objeto complementario te permite acceder 
a sus propiedades y métodos desde adentro de la clase, si las propiedades y los métodos del objeto pertenecen a esa clase, lo que permite una sintaxis más concisa.