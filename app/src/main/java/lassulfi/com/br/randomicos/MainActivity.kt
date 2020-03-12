package lassulfi.com.br.randomicos

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (supportActionBar != null) supportActionBar!!.hide()

        buttonRandom.setOnClickListener(this)
        textNumber.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if(v?.id == R.id.buttonRandom || v?.id == R.id.textNumber) {
            textNumber.text = random().toString()
        }
    }

    fun random(): Int = Random().nextInt(50) + 1
}
