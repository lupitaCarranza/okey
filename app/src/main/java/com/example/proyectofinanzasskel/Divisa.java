package com.example.proyectofinanzasskel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Divisa extends AppCompatActivity {

    TextView textView;
    RadioButton r1, r2, r3, r4, r5, r6, r7, r8, r9;
    Button btn_div;
    TextView seleccionado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divisa);

        r1 = (RadioButton) findViewById(R.id.rbdc);
        r2 = (RadioButton) findViewById(R.id.rbde);
        r3 = (RadioButton) findViewById(R.id.rbe);
        r4 = (RadioButton) findViewById(R.id.rbfz);
        r5 = (RadioButton) findViewById(R.id.rble);
        r6 = (RadioButton) findViewById(R.id.rbpc);
        r7 = (RadioButton) findViewById(R.id.rbpm);
        r8 = (RadioButton) findViewById(R.id.rbs);
        r9 = (RadioButton) findViewById(R.id.rby);

        btn_div = (Button) findViewById(R.id.btn_div);
        seleccionado = (TextView) findViewById(R.id.res);

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (r1.isChecked()) {
                    seleccionado.setText(r1.getText().toString());
                } else if (r2.isChecked()) {
                    seleccionado.setText(r2.getText().toString());
                } else if (r3.isChecked()) {
                    seleccionado.setText(r3.getText().toString());
                } else if (r4.isChecked()) {
                    seleccionado.setText(r4.getText().toString());
                } else if (r5.isChecked()) {
                    seleccionado.setText(r5.getText().toString());
                } else if (r6.isChecked()) {
                    seleccionado.setText(r6.getText().toString());
                } else if (r7.isChecked()) {
                    seleccionado.setText(r7.getText().toString());
                } else if (r8.isChecked()) {
                    seleccionado.setText(r8.getText().toString());
                } else if (r9.isChecked()) {
                    seleccionado.setText(r9.getText().toString());
                } else {
                    seleccionado.setText("Debes seleccionar un tipo de divisa");
                }
            }
        });

        textView = (TextView)findViewById(R.id.btn_div);

        textView.setOnClickListener(v ->{
            //seleccionado.setDiv(div.getText().toString());
            //AppDatabase.getDatabase(getApplicationContext()).userDao().actualizar(div);
            //Toast.makeText(getApplicationContext(), "Guardado", Toast.LENGTH_LONG).show();

            //boton siguiente a balance general
            Intent intent = new Intent(Divisa.this, Balance_General.class);
            startActivity(intent);
            Toast.makeText(getApplicationContext(),"seleccionado:" + R.id.res, Toast.LENGTH_LONG).show();
            Toast.makeText(Divisa.this, "Ingresa tu Balance General", Toast.LENGTH_LONG).show();
        });
    }

}










