package module4

class Aircraft {
    var numberAirplane:Int = 777
    var rangeOfFlight:Double = 10000.0
    var tankCapacity:Double = 180000.0
    var fuelConsumptionFor100km:Double = 1800.0
        get() = tankCapacity/rangeOfFlight*100
}