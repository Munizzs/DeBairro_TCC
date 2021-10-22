package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConfiguracaoInicialActivity extends AppCompatActivity {

    private Button maquina, funcionario, conta, addfuncionario, idioma, moeda, suporte, sobre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.configuracao_inicial);

        maquina = findViewById(R.id.btn_Maquina);
        maquina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ConfiguracaoInicialActivity.this, MaquinaCadastradaActivity.class);
                startActivity(intent);
            }
        });

        conta = findViewById(R.id.btn_Conta);
        conta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ConfiguracaoInicialActivity.this, InformacoesUsuarioActivity.class);
                startActivity(intent);
            }
        });

        funcionario = findViewById(R.id.btn_Funcionarios);
        funcionario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ConfiguracaoInicialActivity.this, AlterarPermissoesActivity.class);
                startActivity(intent);
            }
        });

        addfuncionario = findViewById(R.id.btn_Addfuncionarios);
        addfuncionario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ConfiguracaoInicialActivity.this, AdicionarFuncionarioActivity.class);
                startActivity(intent);
            }
        });

        idioma = findViewById(R.id.btn_Idioma);
        idioma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ConfiguracaoInicialActivity.this, IdiomaActivity.class);
                startActivity(intent);
            }
        });

        moeda = findViewById(R.id.btn_Moeda);
        moeda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ConfiguracaoInicialActivity.this, MoedaLayout.class);
                startActivity(intent);
            }
        });

        suporte = findViewById(R.id.btn_Suporte);
        suporte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ConfiguracaoInicialActivity.this, SuporteConfiguracaoActivity.class);
                startActivity(intent);
            }
        });

        sobre = findViewById(R.id.btn_Sobre);
        sobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ConfiguracaoInicialActivity.this, ConfiguracaoSobreActivity.class);
                startActivity(intent);
            }
        });
    }

}