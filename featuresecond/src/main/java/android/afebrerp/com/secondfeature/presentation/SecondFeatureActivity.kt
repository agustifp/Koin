package android.afebrerp.com.secondfeature.presentation

import android.afebrerp.com.secondfeature.R
import android.afebrerp.com.secondfeature.presentation.di.commonsViewModule
import android.afebrerp.com.secondfeature.presentation.di.secondFeatureModules
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second_feature.nameTextView
import org.koin.core.KoinComponent
import org.koin.core.context.loadKoinModules
import org.koin.core.context.unloadKoinModules
import org.koin.core.inject
import org.koin.core.parameter.parametersOf

class SecondFeatureActivity : AppCompatActivity(), KoinComponent , SecondFeaturePresenter.View {

    private val presenter : SecondFeaturePresenter.Presenter by inject{ parametersOf(this as SecondFeaturePresenter.View)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_feature)
        loadKoinModules(secondFeatureModules)
        presenter.retrieveName()
    }

    override fun onNameRetrieved(name: String) {
        nameTextView.text = name
    }

    override fun onDestroy() {
        super.onDestroy()
        unloadKoinModules(commonsViewModule)
    }
}
