package com.example.estructurasdecontrol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

data class semana17(val nombre:String, val apellido:String)
class Ejemplo : AppCompatActivity() {

    val  grupo1=semana17("Antonio", "Perez")
    val  grupo2=semana17("Alejando", "Cortez")
    val  grupo3=semana17("Fernando", "Gomez")
    val  grupo4=semana17("Gabriela", "Maldonado")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejemplo)

        val texto1=findViewById<TextView>(R.id.txtMsj)
        texto1.setText("Nuevo mensaje")

        val texto2=findViewById<TextView>(R.id.txtMsj1)
        texto2.setText(" Nombre: ${grupo2.nombre} Apellido: ${grupo2.apellido}" )

        val boton =findViewById<Button>(R.id.btnMensajeE)
        boton.setOnClickListener (){
            view -> vermensaje("Mensaje modificado")
        }
        val btnregresar=findViewById<Button>(R.id.btnRegresarE)
        btnregresar.setOnClickListener{
            val principal=Intent(this, MainActivity::class.java)
            startActivity(principal)
        }

    }
    fun vermensaje(mensaje:String){
        val texto3=findViewById<TextView>(R.id.txtMsj2)
        texto3.setText(mensaje)
    }
}