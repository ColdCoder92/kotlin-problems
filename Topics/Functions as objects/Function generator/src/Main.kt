fun identity(a: Int): Int = a

fun half(b: Int) = b / 2

fun zero(c: Int) = 0

fun generate(functionName: String): (Int) -> Int {
    return when (functionName) {
        "identity" -> ::identity
        "half" -> ::half
        else -> ::zero
    }
}