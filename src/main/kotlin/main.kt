import java.lang.ArithmeticException

// Example without exception handing

fun main() {
println(str)
}
val str = getNumber("10") // The variable 'str' is getting the int value of "10"
fun getNumber(str: String): Int {
    return try {
        Integer.parseInt(str)
    } catch (e: ArithmeticException) {
        0
    }
}