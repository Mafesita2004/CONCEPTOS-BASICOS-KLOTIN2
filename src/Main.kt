//fun main() {
    //EJERCICIO 1
//    val morningNotification = 51
//    val eveningNotification = 135
//    printNotificationSummary(morningNotification)
//    printNotificationSummary(eveningNotification)
//}
//
//fun printNotificationSummary(numberOfMessages: Int) {
//    if (numberOfMessages < 100) {
//        println("You have $numberOfMessages notifications.")
//    } else {
//        println("Your phone is blowing up! You have 99+ notifications.")
//    }
//}
    //EJERCICIO 2
//
//        val child = 5
//        val adult = 28
//        val senior = 87
//        val isMonday = true
//        println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
//        println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
//        println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
//    }
//
//    fun ticketPrice(age: Int, isMonday: Boolean): Int {
//        return when {
//            age < 0 || age > 100 -> -1
//            age <= 12 -> 15
//            age in 13..60 -> if (isMonday) 25 else 30
//            age >= 61 -> 20
//            else -> -1
//        }
//    }
    //EJERCICIO 3
//        printFinalTemperature(27.0, "Celsius", "Fahrenheit") { c -> (9.0/5.0) * c + 32 }
//        printFinalTemperature(350.0, "Kelvin", "Celsius") { k -> k - 273.15 }
//        printFinalTemperature(10.0, "Fahrenheit", "Kelvin") { f -> (5.0/9.0) * (f - 32) + 273.15 }
//    }
//
//    fun printFinalTemperature(
//        initialMeasurement: Double,
//        initialUnit: String,
//        finalUnit: String,
//        conversionFormula: (Double) -> Double
//    ) {
//        val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement))
//        println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
//    }

//EJERCICIO 4
//    val amanda = Person("Amanda", 33, "play tennis", null)
//    val atiqah = Person("Atiqah", 28, "climb", amanda)
//    amanda.showProfile()
//    atiqah.showProfile()
//}
//
//    class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
//        fun showProfile() {
//            println("Name: $name")
//            println("Age: $age")
//            hobby?.let {
//                print("Likes to $it. ")
//            }
//            if (referrer != null) {
//                println("Has a referrer named ${referrer.name}, who likes to ${referrer.hobby}.")
//            } else {
//                println("Doesn't have a referrer.")
//            }
//        }
//    }

//EJERCICIO 5
//open class Phone(var isScreenLightOn: Boolean = false) {
//    open fun switchOn() {
//        isScreenLightOn = true
//    }
//
//    fun switchOff() {
//        isScreenLightOn = false
//    }
//
//    fun checkPhoneScreenLight() {
//        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
//        println("The phone screen's light is $phoneScreenLight.")
//    }
//}
//
//class FoldablePhone(isScreenLightOn: Boolean = false, var isFolded: Boolean = false) : Phone(isScreenLightOn) {
//    override fun switchOn() {
//        if (!isFolded) {
//            super.switchOn()
//        }
//    }
//
//    fun fold() {
//        isFolded = true
//        switchOff()
//    }
//
//    fun unfold() {
//        isFolded = false
//    }
//}
//
//fun main() {
//    val phone = FoldablePhone()
//    phone.switchOn()
//    phone.checkPhoneScreenLight()  // Should print: The phone screen's light is on.
//    phone.fold()
//    phone.checkPhoneScreenLight()  // Should print: The phone screen's light is off.
//    phone.unfold()
//    phone.switchOn()
//    phone.checkPhoneScreenLight()  // Should print: The phone screen's light is on.
//}



//EJERCICIO 6
//
//fun main() {
//    val winningBid = Bid(5000, "Private Collector")
//    println("Item A is sold at ${auctionPrice(winningBid, 2000)}.")
//    println("Item B is sold at ${auctionPrice(null, 3000)}.")
//}
//
//class Bid(val amount: Int, val bidder: String)
//
//fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
//    return bid?.amount ?: minimumPrice
//}

