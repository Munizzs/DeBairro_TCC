package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private Button btnEsqueceuSenha, login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        btnEsqueceuSenha = findViewById(R.id.btn_EsqueceuSenha);


        login = findViewById(R.id.btn_Login2);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(LoginActivity.this, TelaPrincipalActivity.class);
                startActivity(intent);
            }
        });
    }


}
