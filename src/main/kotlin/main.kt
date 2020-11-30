// Getters and Setters

fun main() {
var myCar = Car()
    println("Brand is : ${myCar.myBrand}")
    myCar.maxSpeed = -5
    println("Max speed is ${myCar.maxSpeed}")
    println("Model is ${myCar.myModel}")
}
class Car() {
   lateinit var owner : String

   val myBrand : String = "BMW"
       // Custom getter
    get() {
        return field.toLowerCase()
    }
    var maxSpeed : Int = 250
    get() = field
    set(value) {
        field = if(value > 0) value else throw IllegalArgumentException("Max speed cannot be less than 0")
    }

    var myModel : String = "M5"
    private set

    init {
        this.myModel = "M3"
        this.owner = "Frank"
    }
}