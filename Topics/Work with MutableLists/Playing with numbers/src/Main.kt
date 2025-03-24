fun main() {
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    // do not touch the lines above
    // write your code here
    var sum = numbers[0]
    for (i in 1 until numbers.size) {
        sum += numbers[i]
    }
    numbers.add(0, sum)
    numbers.removeAt(numbers.size - 2)
    // do not touch the lines below
    println(numbers.joinToString(" "))
}