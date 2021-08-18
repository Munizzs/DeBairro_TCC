package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class NovaVendaLayoutActivity extends AppCompatActivity {

    ArrayList<String> FormaDePagamento;
    ArrayAdapter<String> FormaPagamento;
    CadastroAdministrador.ViewHolder mViewHolder = new CadastroAdministrador.ViewHolder();
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
        setTheme(R.style.Theme_DeBairro_TCC);
        setContentView(R.layout.nova_venda_layout);


    }
}