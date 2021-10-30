package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Spinner;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class CadastroTipoContaActivity extends AppCompatActivity {
    ArrayAdapter<String> arrayAdapter;
    String tipo[];

    public TextInputLayout tilTipo;
    public AutoCompleteTextView actTipo;
    private Button btnProximo;

    @Override
    protected void onResume() {
        super.onResume();
        tipo = getResources().getStringArray(R.array.Tipo);
        arrayAdapter = new ArrayAdapter<>(getApplicationContext(), R.layout.dropdown_item, tipo);
        actTipo.setAdapter(arrayAdapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_tipo_conta_layout);

        tilTipo = (TextInputLayout) findViewById(R.id.til_tipo);
        actTipo = (AutoCompleteTextView) findViewById(R.id.act_tipo);

        btnProximo = findViewById(R.id.btn_CadastroTipoProximo);
        btnProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CadastroTipoContaActivity.this, CadastroAdministrador.class);
                startActivity(i);
            }
        });

    }
}