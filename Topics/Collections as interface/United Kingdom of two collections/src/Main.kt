fun main() {
    val oldList = readln().split(" ").toMutableList()
    val oldSet = oldList.toMutableSet()
    val addedList = readln().split(" ").toList()

    addListToCollection(oldList, addedList)
    addListToCollection(oldSet, addedList)

    println(oldList.joinToString(" "))
    println(oldSet.joinToString(" "))
}

// Write here function addListToCollection()
fun addListToCollection(c1: MutableCollection<String>, c2: Collection<String>): Unit {
    c1.addAll(c2)
}