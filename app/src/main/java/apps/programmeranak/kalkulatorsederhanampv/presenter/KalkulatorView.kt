package apps.programmeranak.kalkulatorsederhanampv.presenter

import apps.programmeranak.kalkulatorsederhanampv.model.Kalkulator

interface KalkulatorView {
    //todo 7
    fun bindView(kal: Kalkulator)
    fun isEmpty()
}