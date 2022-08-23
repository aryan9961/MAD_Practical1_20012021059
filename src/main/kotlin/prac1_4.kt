fun main(){
    print("Enter the number to check : ")
    val x1 = readLine()!!.toInt()
    if (x1%2==0){
        println("$x1 is EVEN !!")
    }
    else{
        println("$x1 is ODD !!")
    }
}