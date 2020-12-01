// Interfaces


fun main() {
    var audiA3 = Car(200.0,"A3", "Audi")
    var teslaS = ElectricCar(240.0,"S-Model", "Tesla", 85.0)
    teslaS.chargerType = "Type2"
    teslaS.extendRange(200.0)

    //teslaS.drive()
    teslaS.brake()
    audiA3.brake()
    // Polymorphism
//    audiA3.drive(200.0)
//    teslaS.drive(200.0)
}

interface Drivable {
    val maxSpeed: Double
    fun drive(): String
    fun brake() {
        println("The drivable is braking")
    }
}

open class Car(override val maxSpeed: Double,
               val name: String, val brand: String): Drivable {

open var range: Double = 0.0

    fun extendRange(amount: Double) {
        if (amount > 0)
            range += amount
    }
    open fun drive(distance: Double) {
        println("Drive for $distance km")
    }

    // override fun drive(): String = "driving the interface drive"
        override fun drive(): String {
        return "driving the interface drive"
    }
}

// class Car is a sub class of class Car
class ElectricCar(maxSpeed: Double, name: String, brand: String, batteryLife: Double)
    : Car(maxSpeed, name, brand) {

    var chargerType = "Type1"
    override var range = batteryLife * 6
    override fun drive(distance: Double) {
        println("Drive for $distance km on electricity")
    }
       override fun drive(): String {
           return "Drive for $range km on electricity"
       }

    override fun brake() {
        super.brake()
        println("brake inside the electric car")
    }
}