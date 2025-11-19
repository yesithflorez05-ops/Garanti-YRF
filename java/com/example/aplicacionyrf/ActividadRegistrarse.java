package com.example.aplicacionyrf;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActividadRegistrarse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_registrarse);

        Button botonRegistrarse = findViewById(R.id.boton_registrarse);
        TextView textoIrALogin = findViewById(R.id.texto_ir_a_login);

        botonRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActividadRegistrarse.this, ActividadPrincipal.class);
                startActivity(intent);
            }
        });

        textoIrALogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActividadRegistrarse.this, ActividadIniciarSesion.class);
                startActivity(intent);
            }
        });
    }
}