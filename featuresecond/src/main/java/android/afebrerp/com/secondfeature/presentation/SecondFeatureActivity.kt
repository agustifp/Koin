package android.afebrerp.com.secondfeature.presentation

import android.afebrerp.com.secondfeature.R
import android.afebrerp.com.secondfeature.domain.usecase.GetUserNameUseCase
import android.afebrerp.com.secondfeature.presentation.di.commonsViewModule
import android.afebrerp.com.secondfeature.presentation.di.secondFeatureModules
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second_feature.nameTextView
import org.koin.core.KoinComponent
import org.koin.core.context.loadKoinModules
import org.koin.core.context.unloadKoinModules
import org.koin.core.inject

class SecondFeatureActivity : AppCompatActivity(), KoinComponent {

    private val getUserNameNameUseCase: GetUserNameUseCase by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loadKoinModules(secondFeatureModules)
        setContentView(R.layout.activity_second_feature)
        val userName = getUserNameNameUseCase.doCommand()
        nameTextView.text = userName
    }

    override fun onDestroy() {
        super.onDestroy()
        unloadKoinModules(commonsViewModule)
    }
}
