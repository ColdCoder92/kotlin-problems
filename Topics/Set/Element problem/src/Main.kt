fun solution(first: Set<String>, second: MutableList<String>): Boolean {
    for (elem in second) {
        if (!first.contains(elem)) {
            return false
        }
    }
    return true
}
/*
fun main() {
    val first = readln().split(" ").map {it}.toSet()
    val second = readln().split(" ").map {it}.toMutableList()
    println(solution(first, second))
}
 */