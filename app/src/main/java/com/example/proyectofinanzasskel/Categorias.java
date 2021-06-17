package com.example.proyectofinanzasskel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Categorias extends AppCompatActivity {
    TextView textView;
    TextView textView2;
    TextView textView3;
    TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias_gastos);

        //para ir a gastos
        textView = (TextView)findViewById(R.id.id_btngastos);
        textView2 = (TextView)findViewById(R.id.id_btningresos);

        textView.setOnClickListener(v ->{
        //boton siguiente
        Intent intent = new Intent(Categorias.this, gastos.class);
        startActivity(intent);
        Toast.makeText(Categorias.this, "Ingresa tus gastos", Toast.LENGTH_LONG).show();
        });

        textView2.setOnClickListener(v ->{
            //boton siguiente
            Intent intent = new Intent(Categorias.this, gastos.class);
            startActivity(intent);
            Toast.makeText(Categorias.this, "Ingresa tus gastos", Toast.LENGTH_LONG).show();
        });

        //para ir a ingresos
        textView3 = (TextView)findViewById(R.id.id_btngastos2);
        textView4 = (TextView)findViewById(R.id.id_btningresos2);

        textView.setOnClickListener(v ->{
            //boton siguiente
            Intent intent = new Intent(Categorias.this, ingresos.class);
            startActivity(intent);
            Toast.makeText(Categorias.this, "Ingresa tus gastos", Toast.LENGTH_LONG).show();
        });

        textView2.setOnClickListener(v ->{
            //boton siguiente
            Intent intent = new Intent(Categorias.this, ingresos.class);
            startActivity(intent);
            Toast.makeText(Categorias.this, "Ingresa tus gastos", Toast.LENGTH_LONG).show();
        });
    }
}
