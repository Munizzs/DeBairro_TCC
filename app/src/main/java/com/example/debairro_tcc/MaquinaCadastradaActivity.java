package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MaquinaCadastradaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maquina_layout);

        Button addmaquina = findViewById(R.id.btn_Maquininha);
        addmaquina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MaquinaCadastradaActivity.this, AdicionarMaquininhaActivity.class);
                startActivity(intent);
            }
        });

        Button voltarmaquina = findViewById(R.id.btn_VoltarMaquina);
        voltarmaquina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MaquinaCadastradaActivity.this, TelaPrincipalActivity.class);
                startActivity(intent);
            }
        });
    }
}