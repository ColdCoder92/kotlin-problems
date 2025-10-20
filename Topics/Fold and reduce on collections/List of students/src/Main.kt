fun main() {
    val list = readln().split(" ")
    // write your code here
    val res = list.foldIndexed(0) {i, acc, s ->
        if (i % 2 == 0) acc + s.length else acc
    }

    println(res)
}