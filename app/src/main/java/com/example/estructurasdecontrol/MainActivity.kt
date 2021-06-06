package com.example.estructurasdecontrol

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnEif = findViewById<Button>(R.id.btnEif)
        val btnEfor = findViewById<Button>(R.id.btnEFor)
        val btnEwhen = findViewById<Button>(R.id.btnEWhen)
        val btnEWhile = findViewById<Button>(R.id.btnEWhile)
        val btnEjemplo = findViewById<Button>(R.id.btnEjemplo)

        val btnSalir = findViewById<Button>(R.id.btnsal)

         btnEif.setOnClickListener{
            val intent = Intent (this,EstructuraIf::class.java)
             startActivity(intent)

        }

        btnEjemplo.setOnClickListener{
            val intent = Intent (this,Ejemplo::class.java)
            startActivity(intent)

        }
        btnEfor.setOnClickListener{
            val intent = Intent (this,EstructuraFor::class.java)
            startActivity(intent)

        }
        btnEwhen.setOnClickListener{
            val intent = Intent (this,EstructuraWhen::class.java)
            startActivity(intent)

        }
        btnEWhile.setOnClickListener{
            val intent = Intent (this,EstructuraWhile::class.java)
            startActivity(intent)

        }
        btnSalir.setOnClickListener {

        }
    }
}