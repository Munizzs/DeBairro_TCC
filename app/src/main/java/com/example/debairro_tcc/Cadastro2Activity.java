package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Cadastro2Activity extends AppCompatActivity {

    Spinner sexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_DeBairro_TCC);
        setContentView(R.layout.cadastro2_layout);
        getSupportActionBar().hide();

        sexo = (Spinner) findViewById(R.id.spn_Sexo);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.Sexo, android.R.layout.simple_spinner_item);
        sexo.setAdapter(adapter);


    }
}