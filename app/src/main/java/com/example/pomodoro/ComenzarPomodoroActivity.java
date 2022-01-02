package com.example.pomodoro;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import java.util.Objects;

public class ComenzarPomodoroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comenzar_pomodoro);
        Objects.requireNonNull(getSupportActionBar()).hide();
    }

    public void volver(View view){
        finish();
    }
}