// complete the definition
infix fun List<Int>.matrix(code: Int): Int {
    var sum = 0
    for (num in this) {
        if (num % code == 0) {
            sum += num
        }
    }
    return sum
}