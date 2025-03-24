fun main() {
    val n = readln().toInt()
    val incomes = IntArray(n) {readln().toInt()}
    val taxes = DoubleArray(n) {i -> incomes[i] * (readln().toInt() / 100.0)}
    var index = 1
    var highestTax = 0.0

    for (i in incomes.indices) {
        if (taxes[i] > highestTax) {
            index = i + 1
            highestTax = taxes[i]
        }
    }

    println(index)
}