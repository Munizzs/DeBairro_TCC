package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MoedaLayout extends AppCompatActivity {

    private Button salvar, voltarconf;
    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moeda_layout);

        /*salvar = findViewById(R.id.btn_salvar_tipo_moeda);
        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MoedaLayout.this, TelaPrincipalActivity.class);
                startActivity(intent);
            }
        });*/

        voltarconf = findViewById(R.id.btn_VoltarMoeda);
        voltarconf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MoedaLayout.this, TelaPrincipalActivity.class);
                startActivity(intent);
            }
        });


        radioGroup = findViewById(R.id.radioGroup_md);
        textView = findViewById(R.id.tv_opcao);


        Button buttonApply = findViewById(R.id.btn_salvar_tipo_moeda);
        buttonApply.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v){
                int radioID= radioGroup.getCheckedRadioButtonId();

                radioButton = findViewById(radioID);
                textView.setText("Você escolheu: " + radioButton.getText());

            }
        });


    }
    public void checkButton(View v){
        int radioID= radioGroup.getCheckedRadioButtonId();

        radioButton = findViewById(radioID);
        Toast.makeText(this,"Moeda selecionada: " + radioButton.getText(), Toast.LENGTH_SHORT).show();
    }
}