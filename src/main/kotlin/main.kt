// Abstract Class


fun main() {
    val stringList: List<String> = listOf(
        "Denis", "Frank", "Michael", "Harry")
    val mixedTypeList: List<Any> = listOf(
        "Denis", 31, 5, "BDay", 70.5, "weights", "kg")
    for (value in mixedTypeList) {
        if (value is Int) {
            println("Integer: '$value'")
        } else if (value is Double) {
            println("Double: '$value' with Floor value ${Math.floor(value)}")
        } else if (value is String) {
            println("String: '$value' of length ${value.length}")
        } else {
            println("Unknown Type")
        }
    }
    // Alternatively
    for (value in mixedTypeList) {
        when(value) {
            is Int -> println("Integer: $value")
            is Double -> println("Double: $value with Floor value ${Math.floor(value)}")
            is String -> println("String: '$value' of length ${value.length} ")
            else -> println("Unknown Type")
        }
    }
    // Smart Type
    val obj1: Any = "I have a dream"
    if(obj1 !is String) {
        println("Not a String")
    } else {
        // obj is automatically cast to a String in this scope
        println("Found a String of length ${obj1.length}")
    }
    // Explicit (unsafe) casting using "as" keyword - can go wrong
    var str1: String = obj1 as String
    println(str1.length)

    val obj2: Any = 1337
    //val str2: String? = obj2 as? String
    //println(str2)

    // Explicit (safe) casting using "as?" keyword
    val obj3: Any = 1337
    val str3: String? = obj3 as? String // Works
    println(str3) // prints null

}



