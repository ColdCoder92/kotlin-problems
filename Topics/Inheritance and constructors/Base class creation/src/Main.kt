open class Base(val id: Int, val length: Float, val message: String) {
    constructor(id: Int): this(id, length = 0f, message = "")
    constructor(id: Int, length: Float): this(id, length, message = "")
}