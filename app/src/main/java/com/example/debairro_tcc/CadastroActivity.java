package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CadastroActivity extends AppCompatActivity {
    ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_DeBairro_TCC);
        setContentView(R.layout.cadastro_layout);
        getSupportActionBar().hide();
        mViewHolder.btnProximo = findViewById(R.id.btn_proximo);
        mViewHolder.btnProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CadastroActivity.this, Cadastro2Activity.class);
                startActivity(i);
            }
        });

    }

    public static class ViewHolder {
        Button btnProximo;
    }
}