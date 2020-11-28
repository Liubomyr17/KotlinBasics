// Classes And Initializers

fun main() {
    var iphone = MobilePhone("iOS", "Apple", "iPhone 12")
    var galaxyS20 = MobilePhone("Android", "Samsung", "Galaxy S20")
    var mateXS = MobilePhone("Android", "Huawei", "Mate X S")
}

class MobilePhone (osName: String, brand: String, model: String) {
    // Initializer block
    init {
        println("The phone $model from $brand uses $osName as its Operating System")
    }
}