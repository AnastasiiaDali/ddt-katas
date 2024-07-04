package ddt

import org.junit.jupiter.api.Test
import store.Product

class StoreDdts {

    @Test
    fun `a manager can register product to the store`() {
        val manager = scenario.newManagerActor()

        manager.canRegisterProductArrival(listOf( Product(id = 1, "Some product", 2)))
    }
}