package android.afebrerp.com.koinexample.navigator

import android.afebrerp.com.firstfeature.navigator.NavigatorFirstFeatureOut
import android.afebrerp.com.secondfeature.presentation.SecondFeatureActivity
import android.afebrerp.com.secondfeature.presentation.di.secondFeatureModules
import android.content.Context
import android.content.Intent
import org.koin.standalone.StandAloneContext.loadKoinModules

class NavigatorFirstOutImpl : NavigatorFirstFeatureOut {
    override fun goToSecondFeatureActivity(context: Context) {
        loadKoinModules(secondFeatureModules)
        context.startActivity(Intent(context, SecondFeatureActivity::class.java))
    }
}