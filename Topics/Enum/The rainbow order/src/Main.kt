enum class Rainbow(val color: String) {
    NULL(""),
    RED("red"),
    ORANGE("orange"),
    YELLOW("yellow"),
    GREEN("green"),
    BLUE("blue"),
    INDIGO("indigo"),
    VIOLET("violet");
}

fun findByColor(color: String): Rainbow {
    for (c in Rainbow.entries) {
        if (c.color == color) {
            return c
        }
    }
    return Rainbow.NULL
}

fun main() {
    val color = readln()
    println(findByColor(color).ordinal)
}