fun main() {
    val list = readln().split(" ")
    // write your code here
    val res = list.sortedWith(naturalOrder()).last()


    println(res)
}