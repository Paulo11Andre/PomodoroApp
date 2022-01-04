package com.example.pomodoro;





import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;

import Clases.Usuario;
import Clases.Utilidades;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Objects.requireNonNull(getSupportActionBar()).hide();

    }

    /**
     *
     * @param view
     * @throws InterruptedException
     * */

    /**public void iniciarSesion(View view) throws InterruptedException {
        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        startActivity(intent);
        finish();
    }*/

    /**
     *
     * @param view
     * @throws InterruptedException
     */
    public static ArrayList<Usuario> usuarios = new ArrayList<>();

    public void CargaDatos() throws IOException {
        String linea;
        InputStream is = this.getResources().openRawResource(R.raw.usuarios);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        if (is!= null){
            while((linea = reader.readLine())!=null){
                String[] datos = linea.split(";");
                Usuario user = new Usuario(datos[0],datos[1],datos[2],datos[3],datos[4]);
                usuarios.add(user);
            }
        }
        is.close();



    }
    public void iniciarSesion(View view) throws InterruptedException, IOException {
        EditText et1 = (EditText) findViewById(R.id.nombreUsuarioID);
        EditText et2 = (EditText) findViewById(R.id.contrasenaID);


        String nombUsu = et1.getText().toString();
        String contra = et2.getText().toString();
        boolean b = false;
        CargaDatos();
        for (Usuario us : usuarios) {
            System.out.println(us.toString());
            if (et1.getText().toString().equals(us.getUsuario()) && et2.getText().toString().equals(us.getContrasenia())) {
                Toast.makeText(this, "Iniciando", Toast.LENGTH_LONG).show();
                b = true;
                Intent intent = new Intent(getApplicationContext(), MenuActivity.class).putExtra("nombUsu", nombUsu);
                startActivity(intent);
                finish();

            }

        }
        if (b == false){ Toast.makeText(this, "No existe este usuario o contraseña incorrecta", Toast.LENGTH_LONG).show();}
    }


    public void crearCuenta(View view ) throws InterruptedException {
        Intent intent = new Intent(getApplicationContext(), CrearCuentaActivity.class);
        startActivity(intent);
        finish();
    }

    public void salir(View view){
        finish();
    }
}