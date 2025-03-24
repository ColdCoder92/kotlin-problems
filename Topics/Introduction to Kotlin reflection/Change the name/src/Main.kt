class Solution{
    fun changeName(): String {
        val cat = Cat()
        val field = cat.javaClass.getDeclaredField("catName")
        field.isAccessible = true
        field.set(cat, readln())
        return field.get(cat) as String
    }
}
