open class Animal {
    open fun makeSound() {
        println("The animal makes a sound")
    }
}

class Dog: Animal() {
    override fun makeSound() {
        println("The dog barks")
    }
}