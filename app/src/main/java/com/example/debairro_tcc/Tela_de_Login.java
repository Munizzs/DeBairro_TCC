package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Tela_de_Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_DeBairro_TCC);
        setContentView(R.layout.activity_tela_de__login);
        getSupportActionBar().hide();
    }
}