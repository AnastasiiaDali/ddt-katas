package store

sealed interface ErrorCode {
    val message: String
}
data object NotAuthenticated : ErrorCode {
    override val message = "User is not authenticated"
}
data object ProductNotFound : ErrorCode {
    override val message = "ERROR! Product wasn't found in the catalog"
}
data object ProductIsOutOfStock : ErrorCode {
    override val message = "ERROR! Product is out of stock at the moment"
}