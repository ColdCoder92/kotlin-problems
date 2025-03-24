fun concatenate(list: List<String>, separator: String): String {
    return buildString {
        for (word in list) {
            append(word)
            append(" - ")
        }
        delete(length - 3, length)
    }
}