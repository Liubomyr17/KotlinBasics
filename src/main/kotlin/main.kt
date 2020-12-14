import java.lang.ArithmeticException

// Example with Finally try-catch block

fun main() {
try {
    val data = 10 / 5
    println(data)
} catch (e: NullPointerException) {
    println(e)
} finally {
    println("Finally block always executes")
}
    println("Below code...")
}
