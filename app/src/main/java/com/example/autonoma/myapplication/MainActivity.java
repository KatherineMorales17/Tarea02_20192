package com.example.autonoma.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtNum1, edtNum2;
    Button btnSuma,btnResta;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Crear las referencias
        edtNum1 = findViewById(R.id.edtNum1);
        edtNum2 = findViewById(R.id.edtNum2);

        btnSuma = findViewById(R.id.btnSuma);
        btnResta = findViewById(R.id.btnResta);

        tvResultado = findViewById(R.id.tvResultado);


        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.valueOf(edtNum1.getText().toString());
                int num2 = Integer.valueOf(edtNum2.getText().toString());
                int suma = num1 + num2;

                tvResultado.setText("La suma es:"+suma);
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.valueOf(edtNum1.getText().toString());
                int num2 = Integer.valueOf(edtNum2.getText().toString());
                int resta = num1 - num2;

                tvResultado.setText("La resta es:"+resta);
            }
        });
    }
}

