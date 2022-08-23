fun main() {

    val x: Int = 44
    val y: String = "34567"
    val z: String = "34567.891"

    val a = x.toDouble()

    val b = y.toInt()

    val c = z.toDouble()

    println("Value of num1I : ${x + 10}")
    println("Value of num1D : ${a + 10}")
    println("Value of num2S : ${y + 10}")
    println("Value of num2I : ${b + 10}")
    println("Value of num3S : ${z + 10}")
    println("Value of num3D : ${c + 10}")
}