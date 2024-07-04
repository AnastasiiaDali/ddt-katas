package store

sealed interface UserSession
data object UnauthenticatedUser : UserSession
data object AuthenticatedUser : UserSession
data object  NoUser : UserSession