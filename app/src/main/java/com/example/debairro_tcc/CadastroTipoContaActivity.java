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
    ArrayAdapter<String> arrayAdapter;
    String[] tipo;


    @Override
    protected void onResume() {
        super.onResume();
        tipo = getResources().getStringArray(R.array.Tipo);
        arrayAdapter = new ArrayAdapter<>(getApplicationContext(), R.layout.dropdown_item, tipo);
        mViewHolder.actTipo.setAdapter(arrayAdapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_DeBairro_TCC);
        setContentView(R.layout.cadastro_tipo_conta_layout);
        getSupportActionBar().hide();



        mViewHolder.tilTipo = (TextInputLayout) findViewById(R.id.til_tipo);
        mViewHolder.actTipo = (AutoCompleteTextView) findViewById(R.id.act_tipo);





    }

    public static class ViewHolder{
        TextInputLayout tilTipo;
        AutoCompleteTextView actTipo;


    }
}