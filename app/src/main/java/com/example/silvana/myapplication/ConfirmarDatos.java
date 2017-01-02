package com.example.silvana.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class ConfirmarDatos extends AppCompatActivity {
    Button btnEditar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        TextView tvNombre = (TextView) findViewById(R.id.nombre);
        TextView tvFecha = (TextView) findViewById(R.id.fecha);
        TextView tvTelefono = (TextView) findViewById(R.id.telefono);
        TextView tvEmail = (TextView) findViewById(R.id.email);
        TextView tvDescripcion = (TextView) findViewById(R.id.descripcion);

        Intent intent = getIntent();

        String strNombre = intent.getExtras().getString(getResources().getString(R.string.nombre));

        String strMes = intent.getExtras().getString(getResources().getString(R.string.mes));
        String strDia = intent.getExtras().getString(getResources().getString(R.string.dia));
        String strAnho = intent.getExtras().getString(getResources().getString(R.string.anho));

        String strTelefono = intent.getExtras().getString(getResources().getString(R.string.telefono));
        String strEmail = intent.getExtras().getString(getResources().getString(R.string.email));
        String strDescripcion = intent.getExtras().getString(getResources().getString(R.string.descripcion));

        tvNombre.setText(strNombre);
        tvFecha.setText(strDia + "/" + strMes + "/" + strAnho);
        tvTelefono.setText(strTelefono);
        tvEmail.setText(strEmail);
        tvDescripcion.setText(strDescripcion);

        btnEditar = (Button)findViewById(R.id.btnEditar);
        btnEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentBack = new Intent(getApplicationContext(), MainActivity.class);

               // intentBack.putExtra(getResources().getString(R.string.nombre), strNombre);

                startActivity(intentBack);
            }
        });
    }

}
