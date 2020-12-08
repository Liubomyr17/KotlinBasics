// ArrayList


fun main() {
    val arraylist: ArrayList<Double> = ArrayList()
    arraylist.add(1.0)
    arraylist.add(2.0)
    arraylist.add(3.0)
    arraylist.add(4.0)
    arraylist.add(5.0)
    var total = 0.0
    for (i in arraylist) {
        total += i
    }
    val average = total / arraylist.size
    println("Average is $average")
}


