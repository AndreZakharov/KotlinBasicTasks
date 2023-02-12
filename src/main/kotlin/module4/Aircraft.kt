package module4

open class Aircraft (_numberAirplane:Int,_rangeOfFlight:Double,_tankCapacity:Double){
    var numberAirplane:Int
    var rangeOfFlight:Double
    var tankCapacity:Double
    var fuelConsumptionFor100km:Double = 1800.0
        get() = tankCapacity/rangeOfFlight*100
    init {
        numberAirplane=_numberAirplane
        rangeOfFlight=_rangeOfFlight
        tankCapacity=_tankCapacity
    }
}
class Boeing747:Aircraft{
var passengerCapacity:Int =400
    constructor(_numberAirplane: Int,_rangeOfFlight: Double,_tankCapacity: Double) : super(_numberAirplane,_rangeOfFlight,_tankCapacity)
}
