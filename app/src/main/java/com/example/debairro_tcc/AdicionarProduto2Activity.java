package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdicionarProduto2Activity extends AppCompatActivity {

    private Button finalizar;
    private Button voltarNV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adicionar_produto2_layout);

        finalizar = findViewById(R.id.btn_FinalizarP);
        finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdicionarProduto2Activity.this,TelaPrincipalActivity.class);
                startActivity(intent);
            }
        });

        voltarNV = findViewById(R.id.btn_Voltaraddproduto);
        voltarNV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdicionarProduto2Activity.this, TelaPrincipalActivity.class);
                startActivity(intent);
            }
        });
    }
}