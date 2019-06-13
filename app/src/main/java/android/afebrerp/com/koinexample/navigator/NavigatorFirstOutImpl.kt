package android.afebrerp.com.koinexample.navigator

import android.afebrerp.com.firstfeature.navigator.NavigatorFirstFeatureOut
import android.afebrerp.com.secondfeature.presentation.SecondFeatureActivity
import android.content.Context
import android.content.Intent
import org.koin.core.KoinComponent

class NavigatorFirstOutImpl : NavigatorFirstFeatureOut , KoinComponent {
    override fun goToSecondFeatureActivity(context: Context) {
        context.startActivity(Intent(context, SecondFeatureActivity::class.java))
    }
}