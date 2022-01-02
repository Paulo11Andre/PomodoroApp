package com.example.pomodoro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        getSupportActionBar().hide();
    }

    public void salir(View view){
        finish();
    }

    public void comenzarPomodoro(View view){
        Intent intent = new Intent(getApplicationContext(), ComenzarPomodoroActivity.class);
        startActivity(intent);
    }

    public void editarPomodoros(View view) throws InterruptedException {
        Intent intent = new Intent(getApplicationContext(), EditarPomodorosActivity.class);
        startActivity(intent);
    }

    public void calendario(View view) throws InterruptedException {
        Intent intent = new Intent(getApplicationContext(), CalendarioActivity.class);
        startActivity(intent);
    }

    public void perfil(View view) throws InterruptedException {
        Intent intent = new Intent(getApplicationContext(), PerfilActivity.class);
        startActivity(intent);
    }

}