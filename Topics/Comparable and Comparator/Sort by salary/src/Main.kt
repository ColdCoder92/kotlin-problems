data class Employee(val name: String, val age: Int, val salary: Int): Comparable<Employee> {
    override fun compareTo(other: Employee): Int {
        return this.salary - other.salary
    }
}