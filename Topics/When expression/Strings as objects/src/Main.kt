fun main() {
    val input = readLine()!!
    println(when (input.firstOrNull()) {
        null -> ""
        'i' -> input.drop(1).toInt() + 1
        's' -> input.drop(1).reversed()
        else -> input
    })
}