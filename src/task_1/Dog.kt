package task_1

class Dog(name: String, weight: Int) : Animal(name, weight) {
    fun toBark() {
        println("$name лает")
    }
}