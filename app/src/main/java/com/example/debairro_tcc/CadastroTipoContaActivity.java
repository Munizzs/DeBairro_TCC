package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class CadastroTipoContaActivity extends AppCompatActivity {
    ViewHolder mViewHolder = new ViewHolder();
    ArrayList<String> arrayListTipo;
    ArrayAdapter<String> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_DeBairro_TCC);
        setContentView(R.layout.cadastro_tipo_conta_layout);
        getSupportActionBar().hide();
        mViewHolder.spnTipo = (Spinner) findViewById(R.id.spn_tipo);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.Tipo, android.R.layout.simple_spinner_item);
        mViewHolder.spnTipo.setAdapter(adapter);
        mViewHolder.tilTipo = (TextInputLayout) findViewById(R.id.til_tipo);
        mViewHolder.actTipo = (AutoCompleteTextView) findViewById(R.id.act_tipo);

        arrayListTipo = new ArrayList<>();
        arrayListTipo.add("Funcionário");
        arrayListTipo.add("Administrador");

        arrayAdapter = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, arrayListTipo);

        mViewHolder.actTipo.setAdapter(arrayAdapter);
        mViewHolder.actTipo.setThreshold(1);


    }

    public static class ViewHolder{
        Spinner spnTipo;
        TextInputLayout tilTipo;
        AutoCompleteTextView actTipo;


    }
}