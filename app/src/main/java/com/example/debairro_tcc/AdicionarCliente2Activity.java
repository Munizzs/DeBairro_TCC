package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdicionarCliente2Activity extends AppCompatActivity {

    private Button FinalizarC2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adicionar_cliente2_layout);

        FinalizarC2 = findViewById(R.id.btn_FinalizarC2);
        FinalizarC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdicionarCliente2Activity.this,ClientesFragment.class);
                startActivity(intent);
            }
        });

    }
}