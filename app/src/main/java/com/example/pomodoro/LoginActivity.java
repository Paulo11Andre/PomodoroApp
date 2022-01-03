package com.example.pomodoro;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Objects;

import Clases.Usuario;
import Clases.Utilidades;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Objects.requireNonNull(getSupportActionBar()).hide();
        Utilidades ut = new Utilidades();
        ut.listaDeUsuarios();
    }

    /**
     *
     * @param view
     * @throws InterruptedException
     * */

    public void iniciarSesion(View view) throws InterruptedException {
        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        startActivity(intent);
        finish();
    }

    /**
     *
     * @param view
     * @throws InterruptedException
     */
    /**
    public void iniciarSesion(View view) throws InterruptedException {
     EditText et1 = (EditText) findViewById(R.id.nombreUsuarioID);
     EditText et2 = (EditText) findViewById(R.id.contrasenaID);
     int encontrado = 0;
     String nombUsu = et1.getText().toString();
     String contra = et2.getText().toString();
     for (Usuario us: Clases.Utilidades.usuarios) {
     if (et1.getText().toString().equals(us.getUsuario()) && et2.getText().toString().equals(us.getContrasenia())) {
     encontrado+=1;
     }
     }
     if(encontrado == 1){
     Intent intent = new Intent(getApplicationContext(), MenuActivity.class).putExtra(nombUsu, contra);
     startActivity(intent);
     finish();
     }else{
     System.out.println("No existe este usuario o contraseña");
     }
     }
     */


    public void crearCuenta(View view ) throws InterruptedException {
        Intent intent = new Intent(getApplicationContext(), CrearCuentaActivity.class);
        startActivity(intent);
        finish();
    }

    public void salir(View view){
        finish();
    }
}