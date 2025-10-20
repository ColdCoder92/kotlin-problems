fun main() {
     val list = readln().split(" ")
    // write your code here
    val res = list.fold(0) { acc, s ->
        if (s.length >= 4) acc + s.length else acc
    }

    println(res)
}