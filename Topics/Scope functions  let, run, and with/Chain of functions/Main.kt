data class Musician(var name: String = "", var band: String = "", var role: String = "")

fun main() {
    val musician = Musician()

    musician.apply {
        name = readln()
        band = readln()
        role = readln()
    }
    /*
       First function body: print the data class and calculate the length of the
       field name.
     */
    val length = musician.let {
        println(it)
        name.length
    }
    /*
       Second function body: pass the calculated length of the field name as a
       parameter, divide it by 4, and print the result on a new line.
     */
    val result = length.let {
        println(it / 4)
        it / 4
    }
    /*
       Third function body: pass the result of division of length by 4 as a
       parameter, add 10 to it, and pass this value to a variable num
     */
    val num = result.run {
        this + 10
    }

    println(num)
}