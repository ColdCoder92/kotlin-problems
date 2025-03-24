// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val d = readln().toInt()

    for (x in 0..1000) { // substitute each value of x in ax^3 + bx^2 + cx + d
        val res = (a * x * x * x) + (b * x * x) + (c * x) + d
        if (res == 0) {
            println(x)
        }
    }
}
