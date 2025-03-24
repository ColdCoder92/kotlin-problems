fun solution(numbers1: Set<Int>, numbers2: Set<Int>): Int {
    val numbers = numbers1 - numbers2
    return numbers.size
}
/*
fun main() {
    val numbers1 = readln().split(' ').map { it.toInt() }.toSet()
    val numbers2 = readln().split(' ').map { it.toInt() }.toSet()
    println(solution(numbers1, numbers2))
}
 */