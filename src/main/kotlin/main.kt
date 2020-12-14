import java.lang.ArithmeticException

// Throw example

fun main() {
validate(15) // Another function
    println("Code after validation check...")
}
fun validate(age: Int) {
    if (age < 18)
        throw ArithmeticException("Under age")
    else
        println("Eligible for drive")
}
