package android.afebrerp.com.secondfeature.domain.usecase

import android.afebrerp.com.secondfeature.domain.repository.UserRepository
import com.example.commonsview.UserUtils

class GetUserNameUseCase(private val userRepository: UserRepository, private val userUtils: UserUtils) {
    fun doCommand() =  userUtils.reformatName(userRepository.getUser().name)
}