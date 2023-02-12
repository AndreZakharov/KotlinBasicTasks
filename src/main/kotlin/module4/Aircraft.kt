package module4

abstract class Aircraft (_numberAirplane:Int,_rangeOfFlight:Double,_tankCapacity:Double){
    protected var numberAirplane:Int
    protected var rangeOfFlight:Double
    protected var tankCapacity:Double
    protected var fuelConsumptionFor100km:Double = 1800.0
        get() = tankCapacity/rangeOfFlight*100
    init {
        numberAirplane=_numberAirplane
        rangeOfFlight=_rangeOfFlight
        tankCapacity=_tankCapacity
    }
    abstract fun infoAboutAirplane()
}
class Boeing747:IPassenger,Aircraft{
    override var passengerCapacity: Int = 400
    constructor(_numberAirplane: Int,_rangeOfFlight: Double,_tankCapacity: Double) : super(_numberAirplane,_rangeOfFlight,_tankCapacity)

    override fun infoAboutAirplane() {
       println("Airplane №: $numberAirplane \nrange Of Flight: $rangeOfFlight \ntank Capacity: $tankCapacity \n" +
               "fuel Consumption For 100 km: $fuelConsumptionFor100km \npassenger Capacity: $passengerCapacity")
    }

}

fun main(args: Array<String>) {
    var aircraftList:MutableMap<Int,String> = mutableMapOf(1 to "Boeing 747",2 to "Airbus Beluga XL",3 to "Sukhoi Superjet 100")

    while (true) {
        println(
            "You can get some information about our airplanes using the following commands\n" +
                    "1  - get a list of company aircraft with ID\n" +
                    "2  - aircraft info menu, use airplane ID for get common information about airplane\n" +
                    "exit - exit from programm or from function\n"
        )
        val command: String = readLine().toString()
        when (command) {
            "1" -> {
                println("list of company aircraft with ID")
                println("ID|  Names")
                aircraftList.forEach { element -> println(element) }
                println()

            }

            "2" -> {
                while (true) {
                    println(
                        "enter the id of the aircraft you are interested in\n" +
                                "for exit use command: exit"
                    )
                    val key = readLine().toString()
                    if (key is String) {
                        if (key == "exit") break
                    }
                    when(key){
                        "1"->{
                            val boeing747: Aircraft = Boeing747(747, 12000.0, 180000.0)
                            boeing747.infoAboutAirplane()
                            println()
                        }
                        "2"->{
                            val airbusBelugaXL: Aircraft = AirbusBelugaXL(117, 11000.0, 180000.0)
                            airbusBelugaXL.infoAboutAirplane()
                            println()
                        }
                        "3"->{
                            val sukhoiSuperjet100: Aircraft = SukhoiSuperjet100(100, 10000.0, 180000.0)
                            sukhoiSuperjet100.infoAboutAirplane()
                            println()
                        }
                    }

                }
            }
            "exit"-> break
        }
    }
}