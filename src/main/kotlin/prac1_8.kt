fun main() {

    println("Array-1 by using arrayOf() Method : ")
    val arr1 = arrayOf(86, 90, 40, 10, 100)
    println(arr1.contentToString())

    println("Array-2 by using Array<>() : ")
    val arr2 = Array(5) { 0 }
    println(arr2.contentToString())

    println("Array-3 by using Array<>() and lambda function : ")
    val arr3 = Array(8) { i -> i }
    println(arr3.contentToString())

    println("Array-4 by using IntArray() : ")
    val arr4 = IntArray(5)
    println(arr4.joinToString(", "))

    println("Array-5 by using intArrayOf() : ")
    val arr5 = intArrayOf(17, 5, 19, 16, 90, 44)
    println(arr5.joinToString(", "))

    println("2-D Array using arrayOf() & intArrayOf() : ")
    val arr6 = arrayOf(intArrayOf(1, 3), intArrayOf(4, 5), intArrayOf(6, 7))
    println(arr6.contentDeepToString())

    print("Enter number of Elements : ")
    val size: Int = readLine()!!.toInt()
    val arr7 = IntArray(size) { 0 }

    for (i in 0 until size) {
        print("Enter the Element : ")
        arr7[i] = readLine()!!.toInt()
    }

    println("\nEntered Array : ")
    println(arr7.contentToString())

    println("========================== Using In-Built Function ==========================")
    println("Array Sorting by in-built Function : ")
    arr7.sort()
    println(arr7.contentToString())

    val arr8 = intArrayOf(54, 88, 42, 0, 99, 55, -23, -87, -999, 980)
    println("========================== NOt using In-Built Function(user-defined function) ==========================")
    println("Array Sorting without in-built Function : ")
    println(arr8.contentToString())

    var temp: Int
    for (i in arr8.indices) {
        for (j in arr8.indices) {
            if (arr8[j] > arr8[i]) {
                temp = arr8[j]
                arr8[j] = arr8[i]
                arr8[i] = temp
            }
        }
    }
    println("Array Sorting without in-built Function : ")
    println(arr8.contentToString())
}
