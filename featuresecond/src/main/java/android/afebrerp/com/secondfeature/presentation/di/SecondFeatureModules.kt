package android.afebrerp.com.secondfeature.presentation.di

import android.afebrerp.com.secondfeature.data.UserRepositoryImpl
import android.afebrerp.com.secondfeature.domain.repository.UserRepository
import android.afebrerp.com.secondfeature.domain.usecase.GetUserNameUseCase
import android.afebrerp.com.secondfeature.presentation.SecondFeaturePresenter
import android.afebrerp.com.secondfeature.presentation.SecondFeaturePresenterImpl
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

val presenterModule = module(override = true) {
    single <SecondFeaturePresenter.Presenter> {
        (view: SecondFeaturePresenter.View) -> SecondFeaturePresenterImpl(view = view, getUserNameUseCase = get())
    }
}

val secondFeatureModules = listOf(
        repositoryModule,
        commonsViewModule,
        useCaseModule,
        presenterModule
)