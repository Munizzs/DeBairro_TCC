package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdicionarClienteActivity extends AppCompatActivity {

    private Button FinalizarC1, AMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adicionar_cliente_layout);

        FinalizarC1 = findViewById(R.id.btn_FinalizarC1);
        FinalizarC1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(AdicionarClienteActivity.this,ClientesFragment.class);
                    startActivity(intent);
                }
            });


            AMI = findViewById(R.id.btn_ClienteAdicionarMaisInformacoes);
            AMI.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent it = new Intent(AdicionarClienteActivity.this,AdicionarCliente2Activity.class);
                    startActivity(it);
                }
            });
    }
}