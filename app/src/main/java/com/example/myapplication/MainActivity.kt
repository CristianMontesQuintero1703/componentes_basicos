package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageButton
import android.widget.RadioButton
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonCompon: Button = findViewById(R.id.button)
        botonCompon.setOnClickListener { mostrarcomponenetes() }

    }

    private fun mostrarcomponenetes() {

        val NombreIngresado: EditText = findViewById(R.id.idNombreText)
        val nombre:String = NombreIngresado.text.toString()

        var radio1value=""
        var radio2value=""
        var check1value=""
        var check2value=""
        var togglebtnvalue=""
        var switchvalue=""

        val radio1: RadioButton = findViewById(R.id.radioButton)
        if (radio1.isChecked) {
            radio1value="El radio1 esta seleccionado"
        } else {
            radio1value="El radio1 no esta seleccionado"
        }

        val radio2: RadioButton = findViewById(R.id.radioButton2)
        if (radio2.isChecked) {
            radio2value="El radio2 esta seleccionado"
        } else {
            radio2value="El radio2 no esta seleccionado"
        }

        val check1: CheckBox = findViewById(R.id.checkBox)
        if (check1.isChecked) {
            check1value="El check1 esta seleccionado"
        } else {
            check1value="El check1 no esta seleccionado"
        }
        val check2: CheckBox = findViewById(R.id.checkBox2)
        if (check2.isChecked) {
            check2value="El check2 esta seleccionado"
        } else {
            check2value="El check2 no esta seleccionado"
        }

        val toggleButton: ToggleButton = findViewById(R.id.toggleButton)
        if (toggleButton.isChecked) {
            togglebtnvalue="El toggleButton esta seleccionado"
        } else {
            togglebtnvalue="El toggleButton no esta seleccionado"
        }
        val switch: Switch = findViewById(R.id.switch1)
        if (switch.isChecked) {
            switchvalue="El switch esta seleccionado"
        } else {
            switchvalue="El switch no esta seleccionado"
        }

        var seleccionados="$nombre \n $radio1value \n $radio2value \n $check1value \n $check2value \n $togglebtnvalue \n $switchvalue"

        Toast.makeText(this,seleccionados, Toast.LENGTH_LONG).show()

    }
}