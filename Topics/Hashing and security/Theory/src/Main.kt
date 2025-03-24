// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
    var num = 1
    try {
        val i = doIt() / (num = 2)
    } catch (Exception e) {
        println(" num = $num")
    }
}

fun doIt(): Int {
    throw Exception("FORGET IT")
}