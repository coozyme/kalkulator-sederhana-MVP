package apps.programmeranak.kalkulatorsederhanampv.presenter

import apps.programmeranak.kalkulatorsederhanampv.model.Kalkulator
//todo 8 masukin interface ke constructor presenter
class KalkulatorPresenter (val kkView : KalkulatorView){

    //todo 3 bikin funtion perhotungan seperti kali dipresenter
    fun hitungKali(nilai1 : String, nilai2 : String){

        //todo 13 check validation user
        if(nilai1.isNotEmpty() && nilai2.isNotEmpty()){
        //todo 4 convert string ke integer
        val nilaia = nilai1.toInt()
        val nilaib = nilai2.toInt()

        val total = nilaia.times(nilaib)

        //todo 5 panggil model masukin nilai login presenter ke model
        val kalkulator = Kalkulator()
        kalkulator.total = total

        //todo 9 masukin model ke interface
        kkView.bindView(kalkulator)
        } else {
            kkView.isEmpty()
        }
    }

    fun hitungtambah(nilai1 : String, nilai2 : String){
        //todo 4 convert string ke integer
        val nilaia = nilai1.toInt()
        val nilaib = nilai2.toInt()

        val total = nilaia.plus(nilaib)

        //todo 5 panggil model masukin nilai login presenter ke model
        val kalkulator = Kalkulator()
        kalkulator.total = total

        //todo 9 masukin model ke interface
        kkView.bindView(kalkulator)
    }
}