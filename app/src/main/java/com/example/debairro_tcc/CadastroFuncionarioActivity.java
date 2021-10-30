package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CadastroFuncionarioActivity extends AppCompatActivity {

    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_funcionario_layout);

        Login = findViewById(R.id.btn_cadastroFuncionario);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CadastroFuncionarioActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

    }
}