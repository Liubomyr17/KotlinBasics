// Nested class

fun main() {
// nested class must be initialized
    println(OuterClass.NestedClass().description) // accessing property
    val obj = OuterClass.NestedClass() // object creation
    obj.foo() // access member function
}

class OuterClass {
    private var name: String = "Mr X"

    class NestedClass {
        var description: String = "code inside nested class"
        private var id: Int = 101
        fun foo() {
            // print("name is ${name}) // cannot access the outer class memeber
            println("Id is $id")
        }
    }
}