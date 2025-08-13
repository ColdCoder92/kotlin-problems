interface MyInterface {
    fun print()
    val amount: Int
}

// Write the correct class here

class AdditionPrinter: MyInterface {
    override fun print() {
        for (i in 1..(amount)) print("*")
    }
    override val amount: Int
        get() = 3 + 7
}

fun main() {

    // Your code here
    val p = AdditionPrinter()

    // Do not change the code below
    p.print()
}