class EspressoMachine {
    val costPerServing: Float

    constructor(coffeeCapsulesCount: Int, totalCost: Float) {
        this.costPerServing = totalCost / coffeeCapsulesCount
    }

    constructor(coffeeBeansWeight: Float, totalCost: Float) {
        val coffeeBeansCount = coffeeBeansWeight / 10
        this.costPerServing = totalCost / coffeeBeansCount
    }
}