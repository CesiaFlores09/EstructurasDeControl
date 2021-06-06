package com.example.estructurasdecontrol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class EstructuraFor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estructura_for)

        val btnregresar3=findViewById<Button>(R.id.btnRegresar3)
        btnregresar3.setOnClickListener{
            val menu = Intent(this, MainActivity::class.java)
            startActivity(menu)
        }

        val names= listOf("Anne","Petter","Jeff")
        for (name in names){
            Toast.makeText(this,name,Toast.LENGTH_LONG).show()
        }
    }
}