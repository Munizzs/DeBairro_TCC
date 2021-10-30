package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class CadastroAdministrador extends AppCompatActivity {

    ArrayList<String>  TipoDeEstabelecimento;
    ArrayAdapter<String> TipoEstabelecimento;
    String tipoEstabelecimento[];
    ArrayAdapter<String> arrayAdapter;
    private TextInputLayout tilTipoDeEstabelecimento;
    private AutoCompleteTextView actTipoDeEstabelecimento;
    private Button btncadastrofun;

    @Override
    protected void onResume() {
        super.onResume();
        tipoEstabelecimento = getResources().getStringArray(R.array.TipoDeEstabelecimento);
        arrayAdapter = new ArrayAdapter<>(getApplicationContext(), R.layout.dropdown_item, tipoEstabelecimento);
        actTipoDeEstabelecimento.setAdapter(arrayAdapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_administrador_layout);

        tilTipoDeEstabelecimento=(TextInputLayout)findViewById(R.id.til_TipoDeEstabelecimento);
        actTipoDeEstabelecimento=(AutoCompleteTextView)findViewById(R.id.act_TipoDeEstabelecimento);

        btncadastrofun = findViewById(R.id.btn_proximotipofun);
        btncadastrofun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CadastroAdministrador.this, CadastroFuncionarioActivity.class);
                startActivity(intent);
            }
        });

    }
}