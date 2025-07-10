fun main() {
    val originalList = readln().split(" ")
    val originalSet = originalList.toSet()
    val word = readln()

    println(dropElements(originalList, word))
    println(dropElements(originalSet, word))
}

// Write function dropElements() here
fun dropElements(list: Collection<String>, word: String): List<String> = list.filter { it != word }