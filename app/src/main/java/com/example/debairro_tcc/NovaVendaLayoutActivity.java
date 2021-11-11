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

public class NovaVendaLayoutActivity extends AppCompatActivity {

    private Button voltarNV;

    ArrayList<String> FormaDePagamento;
    ArrayAdapter<String> FormaPagamento;
    String formaPagamento[];
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onResume() {
        super.onResume();
        formaPagamento = getResources().getStringArray(R.array.FormaDePagamento);
        arrayAdapter = new ArrayAdapter<>(getApplicationContext(), R.layout.dropdown_item, formaPagamento);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nova_venda_layout);


        voltarNV = findViewById(R.id.btn_Voltarfravendas);
        voltarNV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NovaVendaLayoutActivity.this, TelaPrincipalActivity.class);
                startActivity(intent);
            }
        });


    }
}