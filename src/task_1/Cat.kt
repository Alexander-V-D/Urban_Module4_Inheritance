package task_1

class Cat(name: String, weight: Int) : Animal(name, weight) {
    fun toRun() {
        println("$name бежит")
    }
}