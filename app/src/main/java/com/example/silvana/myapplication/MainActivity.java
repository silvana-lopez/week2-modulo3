package com.example.silvana.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity{
    Button btnSiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSiguiente = (Button)findViewById(R.id.btnSiguiente);
        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText nombre = (EditText) findViewById(R.id.nombre);
                DatePicker fecha =(DatePicker) findViewById(R.id.fecha);
                EditText telefono = (EditText) findViewById(R.id.telefono);
                EditText email = (EditText) findViewById(R.id.email);
                EditText descripcion = (EditText) findViewById(R.id.descripcion);
                Intent intent = new Intent(getApplicationContext(), ConfirmarDatos.class);
                intent.putExtra(getResources().getString(R.string.nombre), nombre.getText().toString());

                String mes = String.valueOf((fecha.getMonth()+1));
                String dia = String.valueOf(fecha.getDayOfMonth());
                String anho = String.valueOf(fecha.getYear());

                intent.putExtra(getResources().getString(R.string.dia), dia);
                intent.putExtra(getResources().getString(R.string.mes), mes);
                intent.putExtra(getResources().getString(R.string.anho), anho);
                intent.putExtra(getResources().getString(R.string.telefono), telefono.getText().toString());
                intent.putExtra(getResources().getString(R.string.email), email.getText().toString());
                intent.putExtra(getResources().getString(R.string.descripcion), descripcion.getText().toString());
                startActivity(intent);
            }

        });

    }
    /************************************************/

}
