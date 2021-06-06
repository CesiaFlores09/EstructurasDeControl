package com.example.estructurasdecontrol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class EstructuraWhen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estructura_when)

        val btnregresar2=findViewById<Button>(R.id.btnRegresar2)

        btnregresar2.setOnClickListener{
            val menu = Intent(this, MainActivity::class.java)
            startActivity(menu)
        }

        val vehicile="Bike"
        var message=when(vehicile){
            "Car"->{
              "Four wheels"
            }
            "Bike"->{
                "Two wheels"
            }
            else ->{
                "Unknown number of wheels"
            }
        }
        Toast.makeText(this,"$message",Toast.LENGTH_LONG).show()
        val texto=findViewById<TextView>(R.id.txtMansaje2)
        texto.setText(message)

    }
}