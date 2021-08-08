package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_DeBairro_TCC);
        setContentView(R.layout.login_layout);
        getSupportActionBar().hide();
        mViewHolder.btnEsqueceuSenha = findViewById(R.id.btn_EsqueceuSenha);



    }


    public static class ViewHolder {
        Button btnEsqueceuSenha;
    }
}