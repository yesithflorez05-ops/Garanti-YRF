package com.example.aplicacionyrf;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActividadIniciarSesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_iniciar_sesion);

        Button botonIngresar = findViewById(R.id.boton_ingresar);
        TextView textoIrARegistro = findViewById(R.id.texto_ir_a_registro);

        botonIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActividadIniciarSesion.this, ActividadPrincipal.class);
                startActivity(intent);
            }
        });

        textoIrARegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActividadIniciarSesion.this, ActividadRegistrarse.class);
                startActivity(intent);
            }
        });
    }
}