import java.util.Scanner;

fun main() {
    // put your code here
    val input = Scanner(System.`in`)
    val firstName = input.next()
    val lastName = input.next()
    val age = input.nextInt()
    println("${firstName.first()}. $lastName, $age years old")
}