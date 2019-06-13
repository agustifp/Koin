package android.afebrerp.com.firstfeature

import android.afebrerp.com.firstfeature.navigator.NavigatorFirstFeatureOut
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_first_feature.buttonGoToSecond
import org.koin.core.KoinComponent
import org.koin.core.inject


class FirstFeatureActivity : AppCompatActivity() , KoinComponent {

    private val navigatorFirstFeatureOut : NavigatorFirstFeatureOut by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_feature)
        buttonGoToSecond.setOnClickListener{
            navigatorFirstFeatureOut.goToSecondFeatureActivity(this)
        }
    }
}
