package com.example.kotlin4_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.kotlin4_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainView {

    private var vb: ActivityMainBinding? = null
    val presenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vb?.root)

        vb?.btnCounter1?.setOnClickListener{presenter.counterClick(1)}
        vb?.btnCounter2?.setOnClickListener{presenter.counterClick(2)}
        vb?.btnCounter3?.setOnClickListener{presenter.counterClick(3)}

    }
    //Подсказка к ПЗ: поделить на 3 отдельные функции и избавиться от index
    // Оставляю исходный код, поскольку не пойму зачем делать как в подсказке
    override fun setButtonText(index: Int, text: String) {
        when(index){
            0 -> vb?.btnCounter1?.text = text
            1 -> vb?.btnCounter2?.text = text
            2 -> vb?.btnCounter3?.text = text
        }
    }
}
