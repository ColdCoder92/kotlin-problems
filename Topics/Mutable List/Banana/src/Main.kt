fun solution(strings: MutableList<String>, str: String): MutableList<String> {
    for (i in 0 until strings.size) {
        if (strings[i] == str) {
            strings[i] = "Banana"
        }
    }
    return strings
}
/*
fun main() {
    val strings = readln().split(' ').toMutableList()
    val str = readln()
    println(solution(strings, str).joinToString(separator = " "))
}
 */