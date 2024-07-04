package ddt

import store.ManagerAppHub
import store.Product

abstract class ManagerActor {
    abstract fun canRegisterProductArrival(products: List<Product>)
}

class InMemoryManagerActor(private val hub: ManagerAppHub): ManagerActor() {
    override fun canRegisterProductArrival(products: List<Product>) {
        TODO("Not yet implemented")
    }

}