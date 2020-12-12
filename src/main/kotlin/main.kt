// Lambdas 1

fun main() {
val result1 = sum1(2, 3)
val result2 = sum2(3, 4)
    println("The sum of two numbers from result1 is: $result1")
    println("The sum of two numbers from result2 is: $result2")
// directly print the return value of lambda
// without storing in a variable
    println(sum1(5, 7))
}
// with type annotation in lambda expression
 val sum1 = {a: Int, b: Int -> a + b}

// without type annotation in lambda expression
val sum2 : (Int, Int) -> Int = {a, b -> a + b}

