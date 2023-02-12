package module4

data class Car (var brand:String,var color: String, var number:Int)
fun main(args: Array<String>) {
    val car:Car = Car("BMW","black",777)
    println(car.toString())
}