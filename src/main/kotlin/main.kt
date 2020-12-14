import java.lang.ArithmeticException

// Example with try-catch block

fun main() {
try {
    val a = IntArray(5)
    a[5] = 10 / 0
} catch (e: ArithmeticException) {
    println("arithmetic exception catch")
} catch (e: ArrayIndexOutOfBoundsException) {
    println("array index out of bounds exception")
} catch (e: Exception) {
    println("parent exception class")
}
    println("Code after try catch...")
}
