package com.example.debairro_tcc;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.example.debairro_tcc.database.DeBairroOpenHelper;
import com.google.android.material.snackbar.Snackbar;

public class CadastroActivity extends AppCompatActivity {

    private Button btnProximo;
    private RelativeLayout CadastroActivity;
    private SQLiteDatabase conexao;

    private DeBairroOpenHelper dadosOpenHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_layout);

        CadastroActivity = (RelativeLayout)findViewById(R.id.cadastroLayout);
        criarConexao();

        btnProximo = findViewById(R.id.btn_proximocadastro);
        btnProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CadastroActivity.this, Cadastro2Activity.class);
                startActivity(i);


            }
        });



    }
    private  void criarConexao(){

        try {

            dadosOpenHelper = new DeBairroOpenHelper(this);

            conexao = dadosOpenHelper.getWritableDatabase();

            Snackbar.make(CadastroActivity, "Conexão criada com sucesso!", Snackbar.LENGTH_SHORT)
                    .setAction("OK", null).show();

        }catch (SQLException ex){
            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setTitle("Erro");
            dlg.setNeutralButton("OK", null);


        }


    }
}