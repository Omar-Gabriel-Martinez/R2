package com.example.test_x1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val nameR = intent.getStringExtra("name")
        val tName : TextView = findViewById(R.id.textView)
        val txtNumber: EditText = findViewById(R.id.txt_number)
        val btnContinuar: Button = findViewById(R.id.btn_continuar)

        tName.text = "Bienvenido $nameR"
        btnContinuar.setOnClickListener {
            val edad = txtNumber.text.toString()


            val intent = Intent(this, Activity3::class.java).apply {
                putExtra("name", nameR)
                putExtra("edad", edad)
            }
            startActivity(intent)
        }
    }
}

