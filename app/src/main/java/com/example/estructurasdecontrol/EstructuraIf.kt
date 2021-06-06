package com.example.estructurasdecontrol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class EstructuraIf : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estrutura_if)


         val btnregresar=findViewById<Button>(R.id.btnregresar)

        var mensaje =""
        val x =10
        if (x > 0) {
            mensaje = "X es mayor que 0"
        } else if (x == 0) {
            mensaje = "X igual a 0"
        } else {
            mensaje = "X es meno a 0"
        }
        Toast.makeText(this,"$mensaje",Toast.LENGTH_LONG).show()
        val texto=findViewById<TextView>(R.id.txtMensaje)
        texto.setText(mensaje)

        btnregresar.setOnClickListener{
            val menu =Intent(this, MainActivity::class.java)
            startActivity(menu)
        }









      }

   }





