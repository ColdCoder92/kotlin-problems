fun evenFilter(numbers: Set<Int>): Set<Int> {
    val res = numbers.filter {num -> num % 2 == 0}.toMutableSet()
    return res
}
/*
fun main() {
    val numbers = readln().split(' ').map { it.toInt() }.toSet()
    println(evenFilter(numbers))
}
 */