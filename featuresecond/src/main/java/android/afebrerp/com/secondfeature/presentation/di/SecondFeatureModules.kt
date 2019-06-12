package android.afebrerp.com.secondfeature.presentation.di

import android.afebrerp.com.secondfeature.data.UserRepositoryImpl
import android.afebrerp.com.secondfeature.domain.repository.UserRepository
import android.afebrerp.com.secondfeature.domain.usecase.GetUserUseCase
import org.koin.dsl.module.module

val repositoryModule = module {
    single<UserRepository> { UserRepositoryImpl() }
}

val useCaseModule = module {
    factory {GetUserUseCase(get())}
}

val secondFeatureModules = listOf(
        repositoryModule,
        useCaseModule
)