// Lambdas 2

fun main() {
    val result1 = sum1(2, 3)
    println("The sum of two numbers is: $result1")
}
val sum1 = { a: Int, b: Int -> 
    val num = a + b
    num.toString() // convert Integer to String
    // (Int, Int) -> String
}

