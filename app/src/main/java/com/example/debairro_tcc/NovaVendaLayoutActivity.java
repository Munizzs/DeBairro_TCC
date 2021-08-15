package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class NovaVendaLayoutActivity extends AppCompatActivity {
    TextInputLayout tilFormaPagamento;
    AutoCompleteTextView actFormaPagamento;
    String formaPagamento[];
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onResume() {
        super.onResume();
        formaPagamento = getResources().getStringArray(R.array.FormaDePagamento);
        arrayAdapter = new ArrayAdapter<>(getApplicationContext(), R.layout.dropdown_item, formaPagamento);
        actFormaPagamento.setAdapter(arrayAdapter);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nova_venda_layout);
        tilFormaPagamento = findViewById(R.id.til_FormaDePagamento);
        actFormaPagamento = findViewById(R.id.act_FormaDePagamento);



    }
}