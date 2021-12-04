package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class NovaVendaLayoutActivity extends AppCompatActivity {
    ArrayAdapter<String> arrayAdapter;
    String formaPagamento[];

    private Button voltarNV, salvar;
    public TextInputLayout tilFormaDePagamento;
    public AutoCompleteTextView actFormaDePagamento;

    @Override
    protected void onResume() {
        super.onResume();
        formaPagamento = getResources().getStringArray(R.array.FormaDePagamento);
        arrayAdapter = new ArrayAdapter<>(getApplicationContext(), R.layout.dropdown_item, formaPagamento);
        actFormaDePagamento.setAdapter(arrayAdapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nova_venda_layout);

        tilFormaDePagamento = (TextInputLayout) findViewById(R.id.tilFormaDePagamento);
        actFormaDePagamento = (AutoCompleteTextView) findViewById(R.id.actFormaDePagamento);

        voltarNV = findViewById(R.id.btn_Voltarfravendas);
        voltarNV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NovaVendaLayoutActivity.this, TelaPrincipalActivity.class);
                startActivity(intent);
            }
        });

        salvar = findViewById(R.id.btn_salvarvenda);
        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Venda adicionada!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(NovaVendaLayoutActivity.this, TelaPrincipalActivity.class);
                startActivity(intent);
            }
        });

    }
}