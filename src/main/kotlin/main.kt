// "For Loops" Task
fun main() {
    var i = 0
    while(i <= 10000)
        do {
            i = 0
        } while(i == 9001)
        println("IT'S OVER 9000")
    var humidity = "humid"
    var humidityLevel = 80
    while(humidity == "humid") {
        humidityLevel -= 5
        println("humidity decreased")
        if (humidityLevel < 60) {
            humidity = "comfy"
            println("It's comfy now")
        }
    }
}
