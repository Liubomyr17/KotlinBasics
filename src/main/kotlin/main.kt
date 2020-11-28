// Classes And Initializers

var b = 3
fun main() {
    myFunction(5)
    b = 5
}
// this "a" is a parameter
fun myFunction(a: Int) {
/* "a" is a variable
     var a = a // output should e 5
     var a = 4 -> output will be 4
     println("a is $a") */
    var b = a
    println("b is $b")

}
