// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
    println(emptyList<Int>().any { x -> x % 2 == 0 })  // a
    println(emptyList<Int>().none { x -> x % 2 == 0 }) // b
    println(emptyList<Int>().all { x -> x % 2 == 0 })  // c
}
