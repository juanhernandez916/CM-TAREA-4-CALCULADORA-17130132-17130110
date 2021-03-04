package com.example.cm_1713013217130110_tarea4calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun editarText(v: View){
        val texto_actual: EditText = findViewById(R.id.editTextNumber)
        var texto_boton: String=""
        when(v.getId()){
            R.id.boton0 -> texto_boton = "0"
            R.id.boton1 -> texto_boton="1"
            R.id.boton2 -> texto_boton="2"
            R.id.boton3 -> texto_boton="3"
            R.id.boton4 -> texto_boton="4"
            R.id.boton5 -> texto_boton="5"
            R.id.boton6 -> texto_boton="6"
            R.id.boton7 -> texto_boton="7"
            R.id.boton8 -> texto_boton="8"
            R.id.boton9 -> texto_boton="9"
            R.id.punto -> texto_boton="."

        }
        texto_actual.setText(texto_actual.text.toString()+""+texto_boton)
    }
}