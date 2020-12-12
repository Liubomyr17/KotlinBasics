// Lambdas 3

fun main() {
    println(sum(10, 5))
    sum1(10, 5)
}
val sum: (Int, Int) -> Int = { a: Int, b: Int -> a + b }

// shorter
val sum1 = {a: Int, b: Int -> println(a + b)}