import java.util.Scanner

fun main(args: Array<String>) {
  val input: Scanner = Scanner(System.`in`)
  val mutableList = mutableListOf<Int>()
  val length = readln().toInt()

  for (i in 0 until length) {
       mutableList.add(input.nextInt())
  }

  val sum = mutableList.sum()
  println(sum)
}
