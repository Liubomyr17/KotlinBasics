// "For Loops" Expressions
fun main() {
    for (num in 1..10) {
        print("$num")
        println("__________________")
    }

    for (i in 1 until 10) {
        print("$i ")
        println("__________________")
    }

    for (i in 1.until(10).step(2)) {
        print("$i ")
        println("__________________")
    }

    for (z in 10 downTo 1 step 2) { // Same as - for (z in 10.downTo(1).step(2)
        print("$z ")
        println("__________________")
    }

    for (z in 10.downTo(1).step(2))
        print("$z ")
        println("__________________")
}
