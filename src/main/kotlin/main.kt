//Comparison operators (==, !=, <, >, <=, >=)
fun main() {
var myNum = 5
//    myNum = myNum + 3
    myNum += 3 // 8
    myNum *= 4 // 32
    println("myNum is $myNum") // 32
// Increment & decrement operators (++, --)
    myNum++; // 33
    println("myNum is $myNum") // print 33
    println("myNum is ${myNum++}") // 33
    // myNum++ before the next line (+1) = 34
    println("myNum is ${++myNum}") // (+1) 35
    println("myNum is ${--myNum}") // 34
}