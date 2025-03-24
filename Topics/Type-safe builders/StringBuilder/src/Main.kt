class StringBuilderWrapper {
    private val stringBuilder = StringBuilder()

    fun append(value: String) {
        stringBuilder.append(value)
    }

    fun newline() {
        stringBuilder.appendln()
    }

    fun build(): String {
        return stringBuilder.toString()
    }
}

fun buildString(block: StringBuilderWrapper.() -> Unit): String {
    val builder = StringBuilderWrapper()
    builder.block()
    return builder.build()
}