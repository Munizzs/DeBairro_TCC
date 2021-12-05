package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VisualizarEstoque2Activity extends AppCompatActivity {

    private Button voltarfra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.visualizar_estoque2_layout);

        voltarfra = findViewById(R.id.btn_Voltarfraggestoque);
        voltarfra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(VisualizarEstoque2Activity.this, TelaPrincipalActivity.class);
                startActivity(intent);
            }
        });
    }
}