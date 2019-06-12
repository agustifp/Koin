package android.afebrerp.com.koinexample

import android.afebrerp.com.koinexample.di.generalModules
import android.app.Application
import org.koin.android.ext.android.startKoin
import org.koin.standalone.KoinComponent

class koinExampleApplication : Application(), KoinComponent {

    override fun onCreate() {
        super.onCreate()
        startKoin(this, generalModules)
    }

}