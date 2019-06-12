package android.afebrerp.com.secondfeature.domain.usecase

import android.afebrerp.com.secondfeature.domain.repository.UserRepository

class GetUserUseCase(private val userRepository: UserRepository) {
    fun doCommand() =  userRepository.getUser()
}