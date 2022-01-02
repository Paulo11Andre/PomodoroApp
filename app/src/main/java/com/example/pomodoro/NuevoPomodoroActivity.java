package com.example.pomodoro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class NuevoPomodoroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_pomodoro);
        getSupportActionBar().hide();
    }

    public void volver(View view){
        finish();
    }
}