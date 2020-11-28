// Classes And Initializers

fun main() {
    var mobile = MobilePhone("Android", "Samsung", "Samsung Galaxy S20 Ultra")
}

class MobilePhone (osName: String, brand: String, model: String) {
    // Initializer block
    init {
        println("Initialized a new Mobile Phone object with " +
                "osName = $osName, brand = $brand, model = $model")
    }
}