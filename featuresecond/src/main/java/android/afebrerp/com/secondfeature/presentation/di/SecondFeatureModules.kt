package android.afebrerp.com.secondfeature.presentation.di

import android.afebrerp.com.secondfeature.data.UserRepositoryImpl
import android.afebrerp.com.secondfeature.domain.repository.UserRepository
import android.afebrerp.com.secondfeature.domain.usecase.GetUserNameUseCase
import com.example.commonsview.UserUtils
import org.koin.dsl.module

val repositoryModule = module(override = true) {
    single<UserRepository> { UserRepositoryImpl() }
}

val commonsViewModule = module {
    single { UserUtils }
}

val useCaseModule = module(override = true) {
    factory { GetUserNameUseCase(userRepository = get(), userUtils = get()) }
}

val secondFeatureModules = listOf(
        repositoryModule,
        commonsViewModule,
        useCaseModule
)