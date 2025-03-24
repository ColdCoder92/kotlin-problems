fun main() {
    val list = readln().split(" ").map { it.toInt() }
    // write your code here
    val res = list.all { it % 3 == 0}


    println(res)
}