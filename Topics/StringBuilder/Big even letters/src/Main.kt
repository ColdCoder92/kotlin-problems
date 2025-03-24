fun upperEvenLetters(message: String): String {
    val sb = StringBuilder(message.length)
    for (i in message.indices) {
        if (i % 2 == 0) {
            sb.append(message[i].uppercase())
        }
        else {
            sb.append(message[i])
        }
    }
    return sb.toString()
}