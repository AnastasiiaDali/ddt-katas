package store

sealed class ErrorCode(override val message: String) : Throwable() {
    object NotAuthenticated : ErrorCode("User is not authenticated")
}