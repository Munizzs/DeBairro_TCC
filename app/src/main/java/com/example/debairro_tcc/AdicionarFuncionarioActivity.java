package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdicionarFuncionarioActivity extends AppCompatActivity {

    private Button adicionar, gerarcodigo, voltarcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adicionar_funcionario_layout);

        adicionar = findViewById(R.id.btn_proximofun);
        adicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(AdicionarFuncionarioActivity.this, AlterarPermissoesActivity.class);
                startActivity(intent);
            }
        });

        gerarcodigo = findViewById(R.id.btn_Gerarcodigofuncionario);
        gerarcodigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(AdicionarFuncionarioActivity.this, AdicionarFuncionario2Activity.class);
                startActivity(intent);
            }
        });

        voltarcon = findViewById(R.id.btn_Voltarfunconfiguracao);
        voltarcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(AdicionarFuncionarioActivity.this, ConfiguracaoInicialActivity.class);
                startActivity(intent);
            }
        });
    }
}