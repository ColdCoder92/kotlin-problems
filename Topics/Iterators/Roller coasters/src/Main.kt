fun checkHeight(iterator: Iterator<Int>) {
    iterator.forEach { height ->
        if (height < 145 || height > 210) {
            println("Sorry, not today")
        } else {
            println("You can go!")
        }
    }
}

fun main() {
    val list = readln().split(" ").map(Integer::parseInt).toList()
    checkHeight(list.iterator())
}