fun main() {
    val nums = IntArray(readln().toInt()) { readln().toInt() }
    val target = readln().toInt()
    var found = false

    for (num in nums) {
        if (num == target) {
            found = true
            break
        }
    }

    println(if (found) "YES" else "NO")
}