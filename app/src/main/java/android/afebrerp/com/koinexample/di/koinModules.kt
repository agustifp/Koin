package android.afebrerp.com.koinexample.di

import android.afebrerp.com.koinexample.navigator.NavigatorFirstOutImpl
import org.koin.dsl.module.module
import android.afebrerp.com.firstfeature.navigator.NavigatorFirstFeatureOut

val navigatorModule = module {
    single<NavigatorFirstFeatureOut> { NavigatorFirstOutImpl() }
}

val generalModules = listOf(
        navigatorModule
)