package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button resultbt;
    double num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultbt=findViewById(R.id.Impbtn);

        EditText e1 = (EditText)findViewById(R.id.Otxt);
        EditText e2 = (EditText)findViewById(R.id.Ptxt);
        TextView t1 = (TextView)findViewById(R.id.ghosttxt);

        resultbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1= (double) Double.parseDouble (e1.getText().toString());
                num2= (double) Double.parseDouble (e2.getText().toString());

                double porc = num2/100;
                double descont = porc*num1;
                double vf = num1 - descont;
                t1.setText (Double.toString((double) vf));
                Intent in = new Intent( MainActivity.this, PorcResul.class);
                in.putExtra( "Resultado", t1.getText()); //variavel que vai ser passada para a outra tela
                startActivity (in);
                finish();
            }
        });
    }
}