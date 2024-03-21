package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int valor_contador = 0;

    Button btnContar;

    TextView tvNumero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnContar = findViewById(R.id.btnContar);
        tvNumero = findViewById(R.id.tvNumero);

        btnContar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor_contador++;
                tvNumero.setText("" + valor_contador);
            }
        });
    }
}