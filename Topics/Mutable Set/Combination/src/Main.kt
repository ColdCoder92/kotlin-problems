fun solution(setSource: Set<String>, listSource: MutableList<String>): MutableSet<String> {
    val res = setSource.toMutableSet()
    res.addAll(listSource)
    return res
}
/*
fun main() {
    val setSource = readln().split(' ').map { it }.toSet()
    val listSource = readln().split(' ').map { it }.toMutableList()
    println(solution(setSource, listSource))
}
 */