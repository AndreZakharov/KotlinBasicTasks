package module2

fun main (args:Array<String>) {
    println("Please enter amount of deposit")
    var amount: Double = readLine().toString().toDouble()
    println("Please enter duration , number of month ")
    var month:Int = readLine().toString().toInt()
    println("Please enter monthly deposit interest")
    var rate:Double = readLine().toString().toDouble()

    var i =0
    while (i != month){
        var interest:Double = amount/100*rate
        println("Your deposit will increase this month:" + interest)
        amount+=interest
        println("Your deposit now:" +amount)
        i++
    }

}
