// Classes And Initializers

fun main() {
// Creating instances of classes
    var liubomyr = Person("Liubomyr", "Izdepskyi", 29)
    liubomyr.hobby = "to skateboard"
    liubomyr.age = 30
    println("Liubomyr is ${liubomyr.age} years old")
    liubomyr.stateHobby()
    var john = Person()
    john.hobby = "to play video games"
    john.stateHobby()
//    var johnPeterson = Person(lastName = "Peterson")
}
class Person (firstName: String = "John", lastName: String = "Doe") {
    // Member Variable - Properties
    var age : Int? = null
    var hobby : String = "watch Netflix"
    var firstName : String? = null

    // Initializer Block
    init {
        this.firstName = firstName
        println("Initialized a new Person object with " +
                "firstName = $firstName and lastName = $lastName")
    }
    // Member secondary Constructor
    constructor(firstName: String, lastName: String, age: Int)
    : this(firstName, lastName) {
        this.age = age
        println("Initialized a new Person object with " +
                "firstName = $firstName and lastName = $lastName and age is $age")
    }

    // Member functions - Methods
    fun stateHobby() {
        println("$firstName\'s hobby is $hobby")
    }
}