package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdicionarFuncionario2Activity extends AppCompatActivity {

    private Button sairfu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adicionar_funcionario2_layout);

        sairfu = findViewById(R.id.btn_Sairfu);
        sairfu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(AdicionarFuncionario2Activity.this, ConfiguracaoInicialActivity.class);
                startActivity(intent);
            }
        });
    }
}