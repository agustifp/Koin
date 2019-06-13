package android.afebrerp.com.koinexample

import android.afebrerp.com.koinexample.di.generalModules
import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.KoinComponent
import org.koin.core.context.startKoin

class koinExampleApplication : Application(), KoinComponent {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@koinExampleApplication)
            modules(generalModules)
        }
    }
}