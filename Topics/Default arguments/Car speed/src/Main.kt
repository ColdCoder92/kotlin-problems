fun checkSpeed(speed: Int, limit: Int = 60) {
    if (speed <= limit) {
        println("Within the limit")
    } else {
        val n = speed - limit
        println("Exceeds the limit by $n kilometers per hour")
    }
}