package ddt

import store.*
import kotlin.test.assertEquals

abstract class ManagerActor {
    abstract fun canRegisterProductArrival(products: List<Product>)
    abstract fun canNotRegisterProductArrival(products: Product, failureReason: ErrorCode)
    abstract fun logIn(password: String)
}

class InMemoryManagerActor(private val hub: ManagerAppHub): ManagerActor() {
    override fun canRegisterProductArrival(products: List<Product>) {
        products.forEach { product ->
            hub.register(product)
        }
    }

    override fun canNotRegisterProductArrival(products: Product, failureReason: ErrorCode) {
        assertEquals(Result.failure(ErrorCode.NotAuthenticated), hub.register(products))
    }

    override fun logIn(password: String) {
        hub.logIn(password)
    }

}