package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConfiguracaoInicialActivity extends AppCompatActivity {

    Button maquina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.configuracao_inicial);
        maquina = (Button) findViewById(R.id.btn_Maquina);
    }

    public void maquina(View v){
        Intent in = new Intent(ConfiguracaoInicialActivity.this, MaquinaCadastradaActivity.class);
        startActivity(in);
    }
    /* highish */
}