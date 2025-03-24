

fun main(args: Array<String>) {
    try {
        m1()
    } catch (e: IndexOutOfBoundsException) {
        println("1")
        throw NullPointerException()
    } catch (e: NullPointerException) {
        println("2")
        return
    } catch (e: Exception) {
        println("3")
    } finally {
        println("4")
    }

    println("END")
}

fun m1() {
    println("m1 starts")
    throw IndexOutOfBoundsException("Big Bang")
}
