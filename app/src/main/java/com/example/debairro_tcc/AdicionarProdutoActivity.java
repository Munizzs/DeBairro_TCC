package com.example.debairro_tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdicionarProdutoActivity extends AppCompatActivity {

    private Button proximo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adicionar_produto_layout);

        proximo=findViewById(R.id.btn_proximo);
        proximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AdicionarProdutoActivity.this,AdicionarProduto2Activity.class);
                startActivity(intent);
            }
        });
    }


}