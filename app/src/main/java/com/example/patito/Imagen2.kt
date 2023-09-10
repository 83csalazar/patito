package com.example.patito

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Imagen2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imagen2)

        val btn1: Button = findViewById(R.id.button5)
        val btn2: Button = findViewById(R.id.button6)
        val btn3: Button = findViewById(R.id.button7)
        val btn4: Button = findViewById(R.id.button8)
        val btn5: Button = findViewById(R.id.buttonSalir)

        btn1.setOnClickListener {
            val intent = Intent(this, Imagen1::class.java)
            startActivity(intent)
            finish() // Cierra la actividad MainActivity
        }

        btn2.setOnClickListener {
            val intent = Intent(this, Imagen2::class.java)
            startActivity(intent)
            finish() // Cierra la actividad MainActivity
        }

        btn3.setOnClickListener {
            val intent = Intent(this, Imagen3::class.java)
            startActivity(intent)
            finish() // Cierra la actividad MainActivity
        }

        btn4.setOnClickListener {
            val intent = Intent(this, Imagen4::class.java)
            startActivity(intent)
            finish() // Cierra la actividad MainActivity
        }
        btn5.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish() // Cierra la actividad MainActivity
        }
    }
}