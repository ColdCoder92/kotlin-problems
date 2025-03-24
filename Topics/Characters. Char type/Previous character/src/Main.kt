fun main() {
    val charList = mutableListOf<Char>(
        readln().first(), readln().first(), readln().first(), readln().first()
    )
    for (letter in charList) {
        println(letter - 1)
    }
}