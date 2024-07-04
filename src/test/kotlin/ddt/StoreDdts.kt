package ddt

import org.junit.jupiter.api.Test
import store.ErrorCode
import store.Product

class StoreDdts {

    @Test
    fun `a manager can register product to the store`() {
        val manager = scenario.newManagerActor()

        manager.canRegisterProductArrival(listOf( Product(id = 1, "Some product", 2)))
    }

    @Test
    fun`unauthenticated manager can NOT register product`() {
        val manager = scenario.newManagerActor()
        val wrongPassword = "verySafeButWrongPassword"
        manager.logIn(wrongPassword)
        manager.canNotRegisterProductArrival(Product(id = 1, "Some product", 2), ErrorCode.NotAuthenticated)
    }
}