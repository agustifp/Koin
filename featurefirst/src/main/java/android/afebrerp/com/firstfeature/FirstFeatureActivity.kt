package android.afebrerp.com.firstfeature

import android.afebrerp.com.firstfeature.navigator.NavigatorFirstFeatureOut
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first_feature.*
import org.koin.standalone.KoinComponent
import org.koin.standalone.StandAloneContext.loadKoinModules
import org.koin.standalone.inject


class FirstFeatureActivity : AppCompatActivity() , KoinComponent {

    private val navigatorFirstFeatureOut : NavigatorFirstFeatureOut by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_feature)
        buttonGoToSecond.setOnClickListener{
            navigatorFirstFeatureOut.goToSecondFeatureActivity(this)
        }
        loadKoinModules()
    }
}
