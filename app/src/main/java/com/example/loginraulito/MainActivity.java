package com.example.loginraulito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Iniciar(View view){
        Intent iniciar = new Intent(this,inicio_sesion.class);
        startActivity(iniciar);
    }

    public void Registrar(View view){
        Intent registar = new Intent(this, registrarse.class);
        startActivity(registar);
    }
}