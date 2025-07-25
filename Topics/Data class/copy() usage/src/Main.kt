// do not change this data class
data class Box(val height: Int, val length: Int, val width: Int)

fun main() {
    val height = readln().toInt()
    val length = listOf(readln().toInt(), readln().toInt())
    val width = readln().toInt()
    val box1 = Box(height, length[0], width)
    val box2 = box1.copy(length = length[1])
    println(box1)
    println(box2)
}