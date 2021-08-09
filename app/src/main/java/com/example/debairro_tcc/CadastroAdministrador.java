package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

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
        TipoDeEstabelecimento.add("Bar");
        TipoDeEstabelecimento.add("Mercado");
        TipoDeEstabelecimento.add("Papelaria");
        TipoDeEstabelecimento.add("Bazar");
        TipoDeEstabelecimento.add("Hort-Fruti");

        TipoEstabelecimento=new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item,TipoDeEstabelecimento);

        act_TipoDeEstabelecimento.setAdapter(TipoEstabelecimento);


        act_TipoDeEstabelecimento.setThreshold(1);

        //



    }
}