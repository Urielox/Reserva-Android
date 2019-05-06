package com.example.urielgarciamoreno.reserva;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Actividad2 extends Activity {

    String nombre = "", fecha = "", hora = "", paterno="", materno="", edad ="";
    int personas = 0;
    TextView muestraDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad2);

        muestraDatos = (TextView) findViewById(R.id.muestraDatos);

        Bundle recibe = new Bundle();
        recibe = this.getIntent().getExtras();

        nombre = recibe.getString("nombre");
        paterno = recibe.getString("paterno");
        materno = recibe.getString("materno");
        edad = recibe.getString("edad");
        personas = recibe.getInt("personas");
        fecha = recibe.getString("fecha");
        hora = recibe.getString("hora");

        muestraDatos.setText("Reservacion a nombre de:\n" + nombre + "\n" + "Apellido Paterno:" + paterno
                + "Apellido Materno:" + materno + "\nEdad:" + edad + "\n"
                + personas + " personas\n" + "Fecha: " + fecha + "\nHora: " + hora + "\n");

    }

    public void hacerOtraReserva(View v) {
        Intent envia = new Intent(this, MainActivity.class);
        finish();
        startActivity(envia);
    }

    public void activity(View v) {
        Intent enviar = new Intent(this, Actividad3.class);
        finish();
        startActivity(enviar);
    }

}

