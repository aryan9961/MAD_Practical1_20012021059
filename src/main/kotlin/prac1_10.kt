fun main() {
    val car1 = Car("Audi, 2018", "Amit", 105, 100000.0, 98970.0)
    car1.getCarFullDetails()

    val car2 = Car("Scorpio, 2019", "Rishi", 20, 400000.0, 399900.0)
    car2.getCarFullDetails()

    val Cars = ArrayList<Car> (2)
    val car3 = Car("Swift, 2017","KMP",107,1080000.0,1079000.0)
    val car4 = Car("Hyundai, 2020","NVP",208,4000000.0,3998000.0)
    Cars.add(car3)
    Cars.add(car4)

    for (i in Cars){
        println("-------------------")
        i.getCarFullDetails()
    }
}

class Car(private val model: String, private val owner: String, private val miles: Int, private val original: Double, private val current: Double) {
    init {
        println("Object of class is Created and Init is Called.")
    }

    private fun info(): String {
        return model
    }

    private fun carowner(): String {
        return owner
    }

    private fun milesDrive(): Int {
        return miles
    }

    private fun orgprice(): Double {
        return original
    }

    private fun currprice(): Double {
        return current
    }

    fun getCarFullDetails() {
        println("===================")
        println("Car Information : ${info()}")
        println("Car owner : ${carowner()}")
        println("Miles Drive : ${milesDrive()}")
        println("Original Car Price : ${orgprice()}")
        println("Current Car Price : ${currprice()}")
        println("===================\n")
    }
}