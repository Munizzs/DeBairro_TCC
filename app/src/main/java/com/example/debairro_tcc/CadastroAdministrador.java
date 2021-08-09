package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class CadastroAdministrador extends AppCompatActivity {



    ArrayList<String>  TipoDeEstabelecimento;
    ArrayAdapter<String> TipoEstabelecimento;
    ViewHolder mViewHolder = new ViewHolder();
    String tipoEstabelecimento[];
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onResume() {
        super.onResume();
        tipoEstabelecimento = getResources().getStringArray(R.array.TipoDeEstabelecimento);
        arrayAdapter = new ArrayAdapter<>(getApplicationContext(), R.layout.dropdown_item, tipoEstabelecimento);
        mViewHolder.actTipoDeEstabelecimento.setAdapter(arrayAdapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_DeBairro_TCC);
        setContentView(R.layout.cadastro_administrador_layout);
        getSupportActionBar().hide();

        mViewHolder.tilTipoDeEstabelecimento=(TextInputLayout)findViewById(R.id.til_TipoDeEstabelecimento);
        mViewHolder.actTipoDeEstabelecimento=(AutoCompleteTextView)findViewById(R.id.act_TipoDeEstabelecimento);



    }

    public static class ViewHolder{
        TextInputLayout tilTipoDeEstabelecimento;
        AutoCompleteTextView actTipoDeEstabelecimento;
    }
}