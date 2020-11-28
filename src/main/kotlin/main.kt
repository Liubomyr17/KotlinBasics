// Classes And Initializers

fun main() {
    var liubomyr = Person("Liubomyr", "Panjuta")
    var john = Person()
    var johnPeterson = Person(lastName = "Peterson")
}

class Person (firstName: String = "John", lastName: String = "Doe") {

    // Initializer block
    init {
        println("Initialized a new Person object with " +
        "firstName = $firstName and lastName = $lastName")
    }
}