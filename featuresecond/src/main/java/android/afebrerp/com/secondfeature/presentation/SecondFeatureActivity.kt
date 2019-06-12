package android.afebrerp.com.secondfeature.presentation

import android.afebrerp.com.secondfeature.R
import android.afebrerp.com.secondfeature.domain.usecase.GetUserUseCase
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second_feature.*
import org.koin.standalone.KoinComponent
import org.koin.standalone.inject

class SecondFeatureActivity : AppCompatActivity(), KoinComponent {

    private val getUserUseCase: GetUserUseCase by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_feature)

        val user = getUserUseCase.doCommand()
        nameTextView.text = user.name
    }
}
