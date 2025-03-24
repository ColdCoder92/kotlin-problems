// You can experiment here, it won’t be checked
import java.util.PriorityQueue

fun main(args: Array<String>) {
    val pq = PriorityQueue<Int>()
    for (i in 0..2) {
        pq.add(i)
        pq.add(i)
    }
    println(pq)
}
