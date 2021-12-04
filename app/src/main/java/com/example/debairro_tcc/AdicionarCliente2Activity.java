package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AdicionarCliente2Activity extends AppCompatActivity {

    private Button finalizar, voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adicionar_cliente2_layout);

        finalizar = findViewById(R.id.btn_Voltarcliente);
        finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(AdicionarCliente2Activity.this,TelaPrincipalActivity.class);
                startActivity(it);
            }
        });

        voltar = findViewById(R.id.btn_Finalizarclie);
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Cliente adicionado!", Toast.LENGTH_SHORT).show();
                Intent it = new Intent(AdicionarCliente2Activity.this,TelaPrincipalActivity.class);
                startActivity(it);
            }
        });
    }
}