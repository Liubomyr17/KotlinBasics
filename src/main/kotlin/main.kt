// Nullable

fun main() {
    var name : String = "Liubomyr"
    // name = null -> Compilation ERROR
    var nullableName : String? = "Liubomyr"
    // nullableName = null

    var len = name.length
    // var len2 = nullableName.length -> ERROR
    var len2 = nullableName?.length // -> OK
    println(nullableName?.toLowerCase())
    nullableName?.let { println(it.length) }
}

