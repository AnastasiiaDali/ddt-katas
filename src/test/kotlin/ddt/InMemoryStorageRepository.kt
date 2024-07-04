package ddt

import store.Product
import store.StorageRepository

object InMemoryStorageRepository : StorageRepository {

    private val products = mutableListOf<Product>()

    override fun save(product: Product) {
        products.find { it.id == product.id }?.let { existingProduct ->
            products.remove(existingProduct)
        }

        products += product
    }
}