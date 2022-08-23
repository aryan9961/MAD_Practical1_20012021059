fun main() {
    var a=100
    var b=200
    println("=========== Using Third Variable ===========")
    println("\n====== Before Swapping ======")
    println("a = $a\nb = $b")
    val temp = a
    a=b
    b=temp

    println("====== After Swapping ======")
    println("a = $a\nb = $b")

    var x = 196
    var y = 156
    println("\n=========== Without Using Third Variable ===========")
    println("====== Before Swapping ======")
    println("x = $x\ny = $y")
    x = (x + y)
    y = (x - y)
    x = (x - y)

    println("====== After Swapping ======")
    println("x = $x\ny = $y")
}