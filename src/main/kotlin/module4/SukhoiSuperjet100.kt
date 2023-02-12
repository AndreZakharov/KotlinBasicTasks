package module4

class SukhoiSuperjet100:IPassenger,Aircraft{
    override var passengerCapacity: Int = 108
    constructor(_numberAirplane: Int,_rangeOfFlight: Double,_tankCapacity: Double) : super(_numberAirplane,_rangeOfFlight,_tankCapacity)

    override fun infoAboutAirplane() {
        println("Airplane №: $numberAirplane \nrange Of Flight: $rangeOfFlight \ntank Capacity: $tankCapacity \n" +
                "fuel Consumption For 100 km: $fuelConsumptionFor100km \npassenger Capacity: $passengerCapacity")
    }

}