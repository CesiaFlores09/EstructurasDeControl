package com.example.estructurasdecontrol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class EstructuraWhile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estructura_while)

        val btnregresar1=findViewById<Button>(R.id.btnRegresar1)

        btnregresar1.setOnClickListener{
            val menu = Intent(this, MainActivity::class.java)
            startActivity(menu)
        }
        var x=0
        while (x<5) {

            Toast.makeText(this,"$x",Toast.LENGTH_LONG).show()
            x++//


        }
        }
    }
