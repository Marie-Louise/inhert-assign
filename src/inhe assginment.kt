fun main(){
    var car= Car("benz","toyota","red",10)
    car.carry(4)
    car.identity()
    println( car.calculateParkingFees(2))
    var bus=Bus("perfect","loyality","pink",80)
    bus.carry(86)
    bus.identity()
    println(bus.maxTripFare(24000.34567887654))
    println(bus.calculateParkingFees(3))
}open class vehicle(var make:String,var model:String,var color:String,var capacity:Int) {
    fun carry(people: Int) {
        var x = people - capacity
        if (people >= capacity) {
            println("carrying $ passengers")
        } else {
            println("over caacity by$x people")

        }
    }

    fun identity() {
        println("I am $color $make $model")
    }

    open fun calculateParkingFees(hours: Int): Int {
        return hours * 20
    }
     }
class Car(make: String, model: String, color: String, capacity: Int) : vehicle(make, model, color, capacity) {

}
class Bus(make: String,model: String,color: String,capacity: Int):vehicle(make,model,color,capacity) {
    fun maxTripFare(fare: Double): Double {
        return fare
    }

    override fun calculateParkingFees(hours: Int): Int {
        return hours * capacity

    }
 }


