package android.afebrerp.com.secondfeature.presentation

import android.afebrerp.com.secondfeature.domain.usecase.GetUserNameUseCase

class SecondFeaturePresenterImpl(
        private val view: SecondFeaturePresenter.View,
        private val getUserNameUseCase: GetUserNameUseCase
) :  SecondFeaturePresenter.Presenter {

    override fun retrieveName() {
        view.onNameRetrieved(getUserNameUseCase.doCommand())
    }
}