fun main() {
    val range1 = readln().toInt()..readln().toInt()
    val range2 = readln().toInt()..readln().toInt()
    val target = readln().toInt()
    print(target in range1 && target in range2)
}