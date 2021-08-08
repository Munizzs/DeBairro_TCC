package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_DeBairro_TCC);
        setContentView(R.layout.cadastro_layout);
        getSupportActionBar().hide();

    }
}