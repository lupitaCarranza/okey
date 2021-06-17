package com.example.proyectofinanzasskel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Balance_General extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balance_general);


        textView = (TextView)findViewById(R.id.btn_balgen);

        textView.setOnClickListener(v ->{
        //boton siguiente para las categorias
        Intent intent = new Intent(Balance_General.this, Categorias.class);
        startActivity(intent);
        Toast.makeText(Balance_General.this, "Selecciona tus categorias", Toast.LENGTH_LONG).show();
        });
    }



}
