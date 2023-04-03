package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PorcResul extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_porc_resul);

        TextView resultado=(TextView) findViewById(R.id.result);

        String result = getIntent().getStringExtra("Resultado");

        resultado.setText(result);
    }
}