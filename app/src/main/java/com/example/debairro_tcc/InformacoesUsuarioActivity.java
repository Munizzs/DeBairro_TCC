package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class InformacoesUsuarioActivity extends AppCompatActivity {

    private Button salvar, cancelar, voltarconf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.informacoes_do_usuario_layout);

        salvar = findViewById(R.id.btn_Salvar);
        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(InformacoesUsuarioActivity.this, TelaPrincipalActivity.class);
                startActivity(intent);
            }
        });

        cancelar = findViewById(R.id.btn_CancelarAlteracoes);
        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(InformacoesUsuarioActivity.this, TelaPrincipalActivity.class);
                startActivity(intent);
            }
        });

        voltarconf = findViewById(R.id.btn_Voltarconinf);
        voltarconf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(InformacoesUsuarioActivity.this, TelaPrincipalActivity.class);
                startActivity(intent);
            }
        });
     }

}