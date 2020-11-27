// Kotlin's Functions
// Method - a method is a Function within a class
    fun main() {
    // Argument
    val result = addUp(5, 3)
    val output = takeOff(5, 3)
    val avg = avg(22.3, 13.0)
    println("Result is $result")
    println("Result is $output")
    println("Result is $avg")
    myFunction()
}
    // Parameter (input)
    fun addUp(a: Int, b: Int) : Int {
    // output
    return a + b
    }
    // Parameter (input)
    fun takeOff(a: Int, b: Int) : Int {
    // output
    return a - b
    }
    fun avg(a: Double, b: Double): Double {
        return (a + b) / 2
    }
    fun myFunction() {
    println("Called from myFunction")
    }

