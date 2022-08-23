fun factorial(n:Int):Int{
    var fact=1
    for (i in 1..n) {
        fact *= i
    }
    return fact
}

tailrec fun factTail(n:Int):Int {
    return if (n==1) 1 else n * factTail(n-1)
}

fun main() {
    val n : Int = readLine()!!.toInt()
    println("Factorial of 5 : ${factorial(n)}")
    println("By Tailrec Keyword, Factorial of 5 : ${factTail(n)}")
}