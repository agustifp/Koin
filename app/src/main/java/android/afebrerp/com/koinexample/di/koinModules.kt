package android.afebrerp.com.koinexample.di

import android.afebrerp.com.koinexample.navigator.NavigatorFirstOutImpl
import android.afebrerp.com.firstfeature.navigator.NavigatorFirstFeatureOut
import org.koin.dsl.module

val navigatorModule = module {
    single<NavigatorFirstFeatureOut> { NavigatorFirstOutImpl() }
}

val generalModules = listOf(
        navigatorModule
)