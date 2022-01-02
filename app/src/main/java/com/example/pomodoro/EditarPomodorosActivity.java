package com.example.pomodoro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class EditarPomodorosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_pomodoros);
        getSupportActionBar().hide();
    }

    public void volver(View view){
        finish();
    }
}