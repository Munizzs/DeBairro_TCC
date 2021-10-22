package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdicionarMaquininhaActivity extends AppCompatActivity {

    private Button finalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adicionar_maquininha_layout);

        finalizar = findViewById(R.id.btn_Adicionar);
        finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(AdicionarMaquininhaActivity.this, MaquinaCadastradaActivity.class);
                startActivity(intent);
            }
        });
    }
}