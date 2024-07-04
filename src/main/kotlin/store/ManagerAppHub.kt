package store


class ManagerAppHub(
    private val storage: StorageRepository,
    private val userStorage: UserManagerRepository
) {
    fun register(product: Product): Result<Unit> {
        return if (userStorage.isUserAuthenticated() is AuthenticatedUser) {
            Result.success(storage.save(product))
        } else {
            Result.failure(ErrorCode.NotAuthenticated)
        }
    }

    fun logIn(password: String): Result<Unit> {
        return if (password == "someVerySecureCorrectPassword") {
            Result.success(userStorage.save(AuthenticatedUser))
        } else {
            Result.failure(ErrorCode.NotAuthenticated)
        }
    }
}