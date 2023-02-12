package module4

class AirbusBelugaXL : ICargoAirplane,Aircraft{
    override var loadСapacity: Int = 53000
    constructor(_numberAirplane: Int,_rangeOfFlight: Double,_tankCapacity: Double) : super(_numberAirplane,_rangeOfFlight,_tankCapacity)

    override fun infoAboutAirplane() {
        println("Airplane №: $numberAirplane \nrange Of Flight: $rangeOfFlight \ntank Capacity: $tankCapacity \n" +
                "fuel Consumption For 100 km: $fuelConsumptionFor100km \nLoad Capacity(kg): $loadСapacity")
    }

}