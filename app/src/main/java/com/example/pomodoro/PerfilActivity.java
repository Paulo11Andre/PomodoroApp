package com.example.pomodoro;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import java.util.Objects;

public class PerfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
        Objects.requireNonNull(getSupportActionBar()).hide();
    }

    public void volver(View view){
        finish();
    }
}