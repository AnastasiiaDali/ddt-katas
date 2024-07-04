package store

interface StorageRepository {
    fun save(product: Product)
}

interface UserManagerRepository {
    fun save(userSession: UserSession)
    fun isUserAuthenticated(): UserSession
}