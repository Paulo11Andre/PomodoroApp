package com.example.pomodoro;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import java.util.Objects;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Objects.requireNonNull(getSupportActionBar()).hide();
    }

    public void iniciarSesion(View view) throws InterruptedException {
        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        startActivity(intent);
        finish();
    }

    public void crearCuenta(View view ) throws InterruptedException {
        Intent intent = new Intent(getApplicationContext(), CrearCuentaActivity.class);
        startActivity(intent);
    }

    public void salir(View view){
        finish();
    }
}