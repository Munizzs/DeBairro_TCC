package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VisualizarVendasAcitivity extends AppCompatActivity {

    private Button voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.visualizar_vendas_layout);

        voltar = findViewById(R.id.btn_Voltarfragvendas);
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(VisualizarVendasAcitivity.this, TelaPrincipalActivity.class);
                startActivity(intent);
            }
        });
    }
}