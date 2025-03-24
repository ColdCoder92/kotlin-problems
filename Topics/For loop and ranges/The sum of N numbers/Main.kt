fun main(args: Array<String>) {
    val n = readln().toInt()
    var sum = 0

    for (i in 1..n) {
        sum += readln().toInt()
    }
    println(sum)
}