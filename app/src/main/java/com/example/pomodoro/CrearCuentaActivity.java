package com.example.pomodoro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Objects;

public class CrearCuentaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_cuenta);
        Objects.requireNonNull(getSupportActionBar()).hide();
    }

    /**public void crearCuenta(View view){
        finish();
    }
     */

    public void crearCuenta(View view){
        EditText etNombre = (EditText) findViewById(R.id.crearNombreID);
        EditText etApellido = (EditText) findViewById(R.id.crearApellidoID);
        EditText etNombreUsuario = (EditText) findViewById(R.id.crearNombreUsuarioID);
        EditText etContrasena = (EditText) findViewById(R.id.crearContrasenaID);
        EditText etEMail = (EditText) findViewById(R.id.crearEMailID);
        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(intent);
        finish();
    }

    public void volver(View view){
        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(intent);
        finish();
    }
}