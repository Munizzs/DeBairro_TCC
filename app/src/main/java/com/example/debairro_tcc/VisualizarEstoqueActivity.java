package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VisualizarEstoqueActivity extends AppCompatActivity {

    private Button voltar, apagar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.visualizar_estoque_layout);

        voltar = findViewById(R.id.btn_Voltarfragestoque);
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(VisualizarEstoqueActivity.this, TelaPrincipalActivity.class);
                startActivity(intent);
            }
        });

        apagar = findViewById(R.id.btn_apagar);
        apagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(VisualizarEstoqueActivity.this, VisualizarEstoque2Activity.class);
                startActivity(intent);
            }
        });
    }
}