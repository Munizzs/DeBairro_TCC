package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class AdicionarProdutoActivity extends AppCompatActivity {
    ArrayAdapter<String> arrayAdapter;
    String QuantidadeDeProdutos[];

    public TextInputLayout til_QuantidadeProduto;
    public AutoCompleteTextView act_QuantidadeProduto;
    private Button finalizar, mais, voltar;

    com.google.android.material.textfield.TextInputLayout InsiraNomeProduto, InsiraMarcaDoProduto, PrecoDoProduto, InsiraPrecoDaVenda;

    @Override
    protected void onResume(){
        super.onResume();
        QuantidadeDeProdutos = getResources().getStringArray(R.array.QuantidadeDeProduto);
        arrayAdapter = new ArrayAdapter<>(getApplicationContext(), R.layout.dropdown_item, QuantidadeDeProdutos);
        act_QuantidadeProduto.setAdapter(arrayAdapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adicionar_produto_layout);

        InsiraNomeProduto = findViewById(R.id.edt_InsiraNomeProduto);
        InsiraMarcaDoProduto = findViewById(R.id.edt_InsiraMarcaDoProduto);
        PrecoDoProduto = findViewById(R.id.edt_PrecoDoProduto);
        InsiraPrecoDaVenda = findViewById(R.id.edt_InsiraPrecoDaVenda);

        til_QuantidadeProduto = (TextInputLayout) findViewById(R.id.til_QuantidadeProduto);
        act_QuantidadeProduto = (AutoCompleteTextView) findViewById(R.id.act_QuantidadeProduto);

        finalizar=findViewById(R.id.btn_proximo);
        finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Produto cadastrado!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(AdicionarProdutoActivity.this,TelaPrincipalActivity.class);
                startActivity(intent);
            }
        });

        mais=findViewById(R.id.btn_ProdutoAdicionarMaisInformacoes);
        mais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AdicionarProdutoActivity.this,AdicionarProduto2Activity.class);
                startActivity(intent);
            }
        });

        voltar=findViewById(R.id.btn_Voltarfraestoque);
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AdicionarProdutoActivity.this,TelaPrincipalActivity.class);
                startActivity(intent);
            }
        });


    }



}