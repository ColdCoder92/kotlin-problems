fun main() {
    val numbers = IntArray(readln().toInt()) { readln().toInt() }
    var count: Int = 0
    val target = readln().toInt()

    for (number in numbers) {
        if (number == target) count++
    }

    println(count)
}