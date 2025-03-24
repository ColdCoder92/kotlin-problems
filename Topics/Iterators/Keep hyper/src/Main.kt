fun processIterator(list: List<String>): List<String> {
    val iterator: ListIterator<String> = list.listIterator()
    val result = mutableListOf<String>()

    while (iterator.hasNext()) iterator.next()

    while (iterator.hasPrevious()) {
        val previous = iterator.previous()
        if (previous.startsWith("hyper")) result.add(previous)
    }

    return result
}

fun main() {
    var list = processIterator(readln().split(" "))
    list.forEach { println(it) }
}