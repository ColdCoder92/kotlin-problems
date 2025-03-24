fun removing(currentMap: MutableMap<Int, String>, value: String): MutableMap<Int, String> {
    val result = mutableMapOf<Int, String>()
    result.putAll(currentMap)
    val keys: MutableList<Int> = mutableListOf()
    for ((k, v) in result) {
        if (v == value) {
            keys.add(k)
        }
    }
    for (k in keys) {
        result.remove(k)
    }
    return result
}