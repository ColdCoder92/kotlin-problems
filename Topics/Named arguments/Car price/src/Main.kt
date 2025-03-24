import kotlin.math.abs

// complete this function, add default values
fun carPrice(
    old: Int = 5, kilometers: Int = 100000, maximumSpeed: Int = 120, automatic: Boolean = false
){
    var price = 20000
    price -= (old * 2000)
    price += (100 * (maximumSpeed - 120))
    price -= (200 * (kilometers / 10000))
    price += if (automatic) 1500 else 0
    println(price)
}