fun main() {
    val character = readln().first()
    println(character.isUpperCase() || (character.isDigit() && character != '0'))
}