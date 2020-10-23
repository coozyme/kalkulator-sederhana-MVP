package apps.programmeranak.kalkulatorsederhanampv.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import apps.programmeranak.kalkulatorsederhanampv.R
import apps.programmeranak.kalkulatorsederhanampv.model.Kalkulator
import apps.programmeranak.kalkulatorsederhanampv.presenter.KalkulatorPresenter
import apps.programmeranak.kalkulatorsederhanampv.presenter.KalkulatorView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), KalkulatorView {

    //todo 9
    private var presenter : KalkulatorPresenter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // todo 10 init presenter
        presenter = KalkulatorPresenter(this)

        //todo 1 event listener
        btn_times.setOnClickListener {
            //todo 2 get inputan user
            val nilai1 = edt_num1.text.toString()
            val nilai2 = edt_num2.text.toString()
            //todo 11
            presenter?.hitungKali(nilai1,nilai2)

        }
        btn_plus.setOnClickListener {  }
        btn_less.setOnClickListener {  }
        btn_for.setOnClickListener {  }
    }

    override fun bindView(kal: Kalkulator) {
        //todo 12
        Toast.makeText(this,"${kal.total}", Toast.LENGTH_LONG).show()
    }

    override fun isEmpty() {
        Toast.makeText(this,"Tidak boleh kosong", Toast.LENGTH_LONG).show()
    }
}