package com.example.pomodoro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import java.util.Objects;

public class CrearCuentaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_cuenta);
        Objects.requireNonNull(getSupportActionBar()).hide();
    }

    public void crearCuenta(View view){
        finish();
    }

    public void volver(View view){
        finish();
    }
}