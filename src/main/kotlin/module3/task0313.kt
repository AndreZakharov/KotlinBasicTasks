package module3

fun main(args: Array<String>) {

    countEmployers("One","two","three")
}
fun countEmployers(vararg employers:String){
    var countEmploy:Int = 0
    for (i in employers)
    {
        countEmploy++
    }
    println(countEmploy)
}