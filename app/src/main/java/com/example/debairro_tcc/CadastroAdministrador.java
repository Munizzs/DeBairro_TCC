package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class CadastroAdministrador extends AppCompatActivity {

    TextInputLayout til_TipoDeEstabelecimento;
    AutoCompleteTextView act_TipoDeEstabelecimento;

    ArrayList<String>  TipoDeEstabelecimento;
    ArrayAdapter<String> TipoEstabelecimento;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_administrador_layout);
        getSupportActionBar().hide();

        til_TipoDeEstabelecimento=(TextInputLayout)findViewById(R.id.til_TipoDeEstabelecimento);
        act_TipoDeEstabelecimento=(AutoCompleteTextView)findViewById(R.id.act_TipoDeEstabelecimento);

        TipoDeEstabelecimento=new ArrayList<>();

    }
}