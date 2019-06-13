package android.afebrerp.com.secondfeature.presentation

interface SecondFeaturePresenter {

    interface View {
        fun onNameRetrieved(name : String)
    }

    interface Presenter {
        fun retrieveName()
    }
}