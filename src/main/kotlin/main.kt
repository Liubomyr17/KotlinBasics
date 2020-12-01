// Abstract Class


fun main() {
    val human = Human("Liubomyr", "Ukraine", 70.0, 28.0)
    val elephant = Elephant("Rosy", "India", 5400.0, 25.0)
    human.run()
    human.breath()
    elephant.run()
    elephant.breath()
}

abstract class Mammal(private val name: String, private val origin: String,
private val weight: Double) {
    // Abstract Property (Must be overridden by Subclasses)
    abstract var maxSpeed: Double
    // Abstract Methods (Must be implemented by Subclasses)
    abstract fun run()
    abstract fun breath()

    // Concrete (Non Abstract) Method
    fun displayDetails() {
        println("Name: $name, Origin: $origin, Weight: $weight, " +
        "Max Speed: $maxSpeed")
    }
}

class Human(name: String, origin: String, weight: Double,
override var maxSpeed: Double): Mammal(name, origin, weight) {

    override fun run() {
        // code to run
        println("Runs on two legs")
    }

    override fun breath() {
        // Code to breath
        println("Breath through mouth or nose")
    }
}

class Elephant(name: String, origin: String, weight: Double,
            override var maxSpeed: Double): Mammal(name, origin, weight) {

    override fun run() {
        // code to run
        println("Runs on four legs")
    }

    override fun breath() {
        // Code to breath
        println("Breath through mouth, something else or nose")
    }
}

