package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Tela_de_Cadastro2 extends AppCompatActivity {

    Spinner sexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de__cadastro2);
        getSupportActionBar().hide();

        sexo = (Spinner) findViewById(R.id.spn_Sexo);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.Sexo, android.R.layout.simple_spinner_item);
        sexo.setAdapter(adapter);


    }
}