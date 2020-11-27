// Nullable

fun main() {
    // var name : String = "Liubomyr"
    // name = null -> Compilation ERROR
    var nullableName : String? = "Liubomyr"
    //nullableName = null

    // var len2 = nullableName.length -> ERROR
    var len2 = nullableName?.length // -> OK
    println(nullableName?.toLowerCase())
    nullableName?.let { println(it.length) }

    // ?: -> Elvis operator
    val name = nullableName ?: "Guest"
    println("Name is $name")
    // Output: "Liubomyr"
    // if nullableName is not commented from the line 7, the output should be "Guest"

    nullableName!!.toLowerCase() // Works only when the nullableName from the line 7 is COMMENTED
    // Output: "Name is liubomyr"

    //if we comment println("Name is $name")
    println(nullableName!!.toLowerCase())
    // Output: "liubomyr"

}

