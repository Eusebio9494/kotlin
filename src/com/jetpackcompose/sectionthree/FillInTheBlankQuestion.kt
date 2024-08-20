package com.jetpackcompose.sectionthree

/**
 * Reutilizables Genericos
 */
data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

enum class Difficulty {
    EASY, MEDIUM, HARD
}

interface ProgressPrintable {
    val progressText: String

    fun printProgressBar()
}


class Quiz : ProgressPrintable {

    override val progressText: String
        get() = "${answered} of ${total} answered"

    override fun printProgressBar() {
        repeat(answered) { print("▓") }
        repeat(total - answered) { print("▒") }
        println()
        println(progressText)
    }


    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.EASY)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.MEDIUM)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)

    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
    }

    fun printQuiz() {
        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }

    }
}


fun main() {

    //print("${Quiz.answered} of ${Quiz.total} answered")
    //println(Quiz.progressText)
    //Quiz().printProgressBar()

    val quiz = Quiz().apply { //apply función de alcance

        printQuiz()
    }

}

/*
val Quiz.StudentProgress.progressText: String
    get() = "${answered} of ${total} answered"
*/

/*
fun Quiz.StudentProgress.printProgressBar() {
    repeat(Quiz.answered) { print("▓") }
    repeat(Quiz.total - Quiz.answered) { print("▒") }
    println()
    println(Quiz.progressText)
}
*/

