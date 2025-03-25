import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

@OptIn(ExperimentalContracts::class)
fun Any?.isString(): Boolean {

    contract {
        returns(true) implies (this@isString is String)
    }

    return this is String
}