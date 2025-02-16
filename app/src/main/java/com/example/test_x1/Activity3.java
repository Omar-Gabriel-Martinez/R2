package com.example.test_x1;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Activity3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        TextView txtResult = findViewById(R.id.txt_result);

        // Obtener los datos del intent
        String name = getIntent().getStringExtra("name");
        String edad = getIntent().getStringExtra("edad");

        // Mostrar el nombre y la edad en el TextView
        txtResult.setText("Nombre: " + name + "\nEdad: " + edad + " años");
    }
}