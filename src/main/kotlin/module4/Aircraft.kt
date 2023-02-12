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
