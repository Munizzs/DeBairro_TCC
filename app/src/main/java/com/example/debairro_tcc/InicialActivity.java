package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class InicialActivity extends AppCompatActivity {

    private Button btnCadastro1, btnFacebook, btnLogin, btnGoogle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicial_layout);


        btnCadastro1 = findViewById(R.id.btn_cadastro1);
        btnFacebook = findViewById(R.id.btn_facebook);
        btnLogin = findViewById(R.id.btn_login1);
        btnGoogle = findViewById(R.id.btn_google);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(InicialActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });

        btnCadastro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(InicialActivity.this, CadastroActivity.class);
                startActivity(i);
            }
        });

        btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }



}