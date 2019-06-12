package android.afebrerp.com.secondfeature.data

import android.afebrerp.com.secondfeature.domain.model.User
import android.afebrerp.com.secondfeature.domain.repository.UserRepository


class UserRepositoryImpl : UserRepository {
    override fun getUser(): User {
        return User("123","Mr.Koin")
    }
}