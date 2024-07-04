package store

interface StorageRepository {
    fun save(product: Product)
}