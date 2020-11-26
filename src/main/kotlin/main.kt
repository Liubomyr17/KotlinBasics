// "While Loops" Expressions
fun main() {
    var x = 100
    while(x >= 0) {
        print("$x")
        x -= 2
    }
    println("\nwhile loop is done!")
    x = 1
    do {
        print("$x")
        x++
    } while (x <= 10)
    println("\ndo while loop is done!")
}
