package ddt

import store.AuthenticatedUser
import store.NoUser
import store.UserManagerRepository
import store.UserSession

class InMemoryUserManagerRepository: UserManagerRepository {
    private var loggedInUser: UserSession = NoUser

    override fun save(userSession: UserSession) {
        if (userSession == AuthenticatedUser) {
            loggedInUser = userSession
        } else {
            return
        }
    }

    override fun isUserAuthenticated(): UserSession {
        return loggedInUser
    }
}