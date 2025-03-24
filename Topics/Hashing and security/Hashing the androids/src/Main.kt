import java.security.MessageDigest

//data class Android(val name: String, val energy: Int)

fun calculateAndroidsHash(androids: List<Android>): String {
    // write your code here
    // First create one string to contain all the android strings value in one
    var androidString = ""
    for (android in androids) {
        androidString += android.name + android.energy
    }

    // the return the SHA-512 hash
    val digest = MessageDigest.getInstance("SHA-512")
    digest.update(androidString.toByteArray())
    return digest.digest().joinToString("") { "%02x".format(it) }
}
/*
fun main() {
    val androids = mutableListOf<Android>()
    androids.add(Android("R2D2", 100))
    androids.add(Android("C3PO", 200))
    println(calculateAndroidsHash(androids))
}
 */