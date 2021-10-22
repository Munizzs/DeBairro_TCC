package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlterarPermissoesActivity extends AppCompatActivity {

    private Button concluir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alterar_permissoes_layout);

        concluir = findViewById(R.id.btn_Concluir);
        concluir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(AlterarPermissoesActivity.this, ConfiguracaoInicialActivity.class);
                startActivity(intent);
            }
        });
    }
}