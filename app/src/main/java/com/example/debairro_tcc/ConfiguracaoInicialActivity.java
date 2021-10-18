package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ConfiguracaoInicialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.configuracao_inicial);

    }
    private void IrParaMaquinaCadastrada( ) {

        Intent  MaquinaCadastradas  =  new  Intent( ConfiguracaoInicialActivity.this , MaquinaCadastradaActivity.class );
        startActivity ( MaquinaCadastradas  );

    }

}