package task_2

open class Smartphone(val netGeneration: String) {
    fun call(number: Int) {
        println("Совершается вызов на номер $number")
    }
}