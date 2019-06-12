package android.afebrerp.com.secondfeature.domain.repository

import android.afebrerp.com.secondfeature.domain.model.User

interface UserRepository {
    fun getUser(): User
}