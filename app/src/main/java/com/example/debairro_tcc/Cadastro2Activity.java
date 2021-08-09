package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Cadastro2Activity extends AppCompatActivity {

    ViewHolder mViewHolder = new ViewHolder();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_DeBairro_TCC);
        setContentView(R.layout.cadastro2_layout);
        getSupportActionBar().hide();


        mViewHolder.btnLogin2 = findViewById(R.id.btn_Login2);


        mViewHolder.btnLogin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Cadastro2Activity.this, CadastroTipoContaActivity.class);
                startActivity(i);
            }
        });

    }

    public static class ViewHolder {
        Button btnLogin2;

    }
}