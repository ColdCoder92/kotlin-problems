fun main() {
    val runnable = object: Runnable {
        override fun run() {
            println("Hello, world!")
        }
    }

    runnable.run()
}
