// Nested class

fun main() {
println(OuterClass().InnerClass().description) // accessing property
    var obj = OuterClass().InnerClass() // object creating
    obj.foo()
}

class OuterClass {
    private var name: String = "Mr X"

    inner class InnerClass {
        var description: String = "code inside nested class"
        private var id: Int = 101
        fun foo() {
            println("name is $name") // can access the outer class member
            println("Id is $id")
        }
    }
}