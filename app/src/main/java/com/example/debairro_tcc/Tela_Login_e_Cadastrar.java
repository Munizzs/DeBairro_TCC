package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela_Login_e_Cadastrar extends AppCompatActivity {
    ViewHolder mViewHolder = new ViewHolder();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_DeBairro_TCC);
        setContentView(R.layout.activity_tela__login_e__cadastrar);
        getSupportActionBar().hide();
        mViewHolder.btnCadastro1 = findViewById(R.id.btn_cadastro1);
        mViewHolder.btnFacebook = findViewById(R.id.btn_facebook);
        mViewHolder.btnLogin = findViewById(R.id.btn_login1);
        mViewHolder.btnGoogle = findViewById(R.id.btn_google);

        mViewHolder.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Tela_Login_e_Cadastrar.this, Tela_de_Login.class);
                startActivity(i);
            }
        });

        mViewHolder.btnCadastro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Tela_Login_e_Cadastrar.this, tela_de_cadastro.class);
                startActivity(i);
            }
        });

        mViewHolder.btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mViewHolder.btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    }

    public static class ViewHolder{
        Button btnCadastro1, btnLogin, btnFacebook, btnGoogle;
    }


}