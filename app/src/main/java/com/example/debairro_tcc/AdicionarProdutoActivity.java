package com.example.debairro_tcc;

import static android.view.View.GONE;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AdicionarProdutoActivity extends AppCompatActivity {

    private static final int CODE_GET_REQUEST = 1024;
    private static final int CODE_POST_REQUEST = 1025;

    EditText editTextProduto, editTextMarca, editTextQuantidade, editPrecoProduto, editTextProdutoId;
    Button buttonAddUpdate;
    ProgressBar progressBar;
    ListView listView;
    private Button finalizar, mais, voltar;
    List<Estoque> produtoList;

    boolean isUpdating = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.adicionar_produto_layout);
        editTextProdutoId = findViewById(R.id.editTextProdutoId);
    editTextProduto = findViewById(R.id.editTextProduto);
    editTextMarca = findViewById(R.id.editTextMarca);
    editTextQuantidade = findViewById(R.id.editTextQuantidade);
    editPrecoProduto = findViewById(R.id.editPrecoProduto);
    progressBar = findViewById(R.id.progressBar);

    listView = findViewById(R.id.listViewHeroes);
    buttonAddUpdate = findViewById(R.id.buttonAddUpdate);

        produtoList = new ArrayList<>();

        mais = findViewById(R.id.btn_ProdutoAdicionarMaisInformacoes);
        mais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AdicionarProdutoActivity.this, AdicionarProduto2Activity.class);
                startActivity(intent);
            }
        });

        voltar = findViewById(R.id.btn_Voltarfraestoque);
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AdicionarProdutoActivity.this, TelaPrincipalActivity.class);
                startActivity(intent);
            }
        });


        buttonAddUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (isUpdating) {
                    updateProduto();
                } else {
                    createProduto();
                }
                Toast.makeText(getBaseContext(), "Produto cadastrado!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(AdicionarProdutoActivity.this, VisualizarEstoqueActivity.class);
                startActivity(intent);
            }

        });

        readProdutos();

}

    private void createProduto() {
        String nome = editTextProduto.getText().toString().trim();
        String marca = editTextMarca.getText().toString().trim();
        String Quantidade = editTextQuantidade.getText().toString().trim();
        String preco = editPrecoProduto.getText().toString().trim();


        if (TextUtils.isEmpty(nome)) {
            editTextProduto.setError("Por favor entre com o nome");
            editTextProduto.requestFocus();
            return;
        }

        if (TextUtils.isEmpty(marca)) {
            editTextMarca.setError("Por favor entre com a marca");
            editTextMarca.requestFocus();
            return;
        }

        if (TextUtils.isEmpty(Quantidade)) {
            editTextQuantidade.setError("Por favor entre com a quantidade");
            editTextQuantidade.requestFocus();
            return;
        }

        if (TextUtils.isEmpty(preco)) {
            editTextProduto.setError("Por favor entre com o preco");
            editTextProduto.requestFocus();
            return;
        }

        //Conexão entre o Android e o PHP através do Hash.
        HashMap<String, String> params = new HashMap<>();
        params.put("nome",nome);
        params.put("marca",marca);
        params.put("Quantidade",Quantidade);
        params.put("precodevenda", preco);

        PerformNetworkRequest request = new PerformNetworkRequest(Api.URL_CREATE_PRODUTO, params, CODE_POST_REQUEST);
        request.execute();
    }
    private void readProdutos() {
            PerformNetworkRequest request = new PerformNetworkRequest(Api.URL_READ_PRODUTOS, null, CODE_GET_REQUEST);
            request.execute();
        }

    private void updateProduto() {
        String id = editTextProdutoId.getText().toString();
        String nome = editTextProduto.getText().toString().trim();
        String marca = editTextMarca.getText().toString().trim();
        String quantidade = editTextQuantidade.getText().toString().trim();
        String preco = editPrecoProduto.getText().toString().trim();

        if (TextUtils.isEmpty(nome)) {
            editTextProduto.setError("Por favor entre com o nome");
            editTextProduto.requestFocus();
            return;
        }

        if (TextUtils.isEmpty(marca)) {
            editTextMarca.setError("Por favor entre com a marca");
            editTextMarca.requestFocus();
            return;
        }

        if (TextUtils.isEmpty(quantidade)) {
            editTextQuantidade.setError("Por favor entre com a quantidade");
            editTextQuantidade.requestFocus();
            return;
        }

        if (TextUtils.isEmpty(preco)) {
            editTextProduto.setError("Por favor entre com o preco");
            editTextProduto.requestFocus();
            return;
        }

        HashMap<String, String> params = new HashMap<>();
        params.put("id", id);
        params.put("nome",nome);
        params.put("marca",marca);
        params.put("quantidade",quantidade);
        params.put("precodevenda", preco);


        PerformNetworkRequest request = new PerformNetworkRequest(Api.URL_UPDATE_PRODUTO, params, CODE_POST_REQUEST);
        request.execute();

        buttonAddUpdate.setText("Adicionar");

        editTextProduto.setText("");
        editTextMarca.setText("");
        editTextQuantidade.setText("");
        editPrecoProduto.setText("");

        isUpdating = false;
    }
    private void deleteProduto(int id) {
        PerformNetworkRequest request = new PerformNetworkRequest(Api.URL_DELETE_PRODUTO + id, null, CODE_GET_REQUEST);
        request.execute();
    }
    private void refreshHeroList(JSONArray produto) throws JSONException {
        produtoList.clear();

        for (int i = 0; i < produto.length(); i++) {
            JSONObject obj = produto.getJSONObject(i);

            produtoList.add(new Estoque(
                    obj.getInt("IDProduto"),
                    obj.getString("nome"),
                    obj.getString("marca"),
                    obj.getInt("quantidade"),
                    obj.getInt("precodevenda")
            ));
        }

        HeroAdapter adapter = new HeroAdapter(produtoList);
        listView.setAdapter(adapter);
    }
    private class PerformNetworkRequest extends AsyncTask<Void, Void, String> {
        String url;
        HashMap<String, String> params;
        int requestCode;

        PerformNetworkRequest(String url, HashMap<String, String> params, int requestCode) {
            this.url = url;
            this.params = params;
            this.requestCode = requestCode;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressBar.setVisibility(View.VISIBLE);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            progressBar.setVisibility(GONE);
            try {
                JSONObject object = new JSONObject(s);
                if (!object.getBoolean("error")) {
                    Toast.makeText(getApplicationContext(), object.getString("message"), Toast.LENGTH_SHORT).show();
                    refreshHeroList(object.getJSONArray("produto"));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        @Override
        protected String doInBackground(Void... voids) {
            RequestHandler requestHandler = new RequestHandler();

            if (requestCode == CODE_POST_REQUEST)
                return requestHandler.sendPostRequest(url, params);


            if (requestCode == CODE_GET_REQUEST)
                return requestHandler.sendGetRequest(url);

            return null;
        }
    }
    class HeroAdapter extends ArrayAdapter<Estoque> {
        List<Estoque> produtoList;

        public HeroAdapter(List<Estoque> produtoList) {
            super(AdicionarProdutoActivity.this, R.layout.visualizar_estoque_layout, produtoList);
            this.produtoList = produtoList;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = getLayoutInflater();
            View listViewItem = inflater.inflate(R.layout.visualizar_estoque_layout, null, true);

            TextView textViewName = listViewItem.findViewById(R.id.textViewName);

            TextView textViewUpdate = listViewItem.findViewById(R.id.textViewUpdate);
            TextView textViewDelete = listViewItem.findViewById(R.id.textViewDelete);

            final Estoque estoque = produtoList.get(position);

            textViewName.setText(estoque.getNome());

            textViewUpdate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    isUpdating = true;
                    editTextProdutoId.setText(String.valueOf(estoque.getIdEstabelecimento()));
                    editTextProduto.setText(estoque.getNome());
                    editTextMarca.setText(estoque.getMarca());
                    editTextQuantidade.setText(estoque.getQuantidade());
                    editPrecoProduto.setText(estoque.getPrecodevenda());

                    buttonAddUpdate.setText("Alterar");
                }
            });

            textViewDelete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    AlertDialog.Builder builder = new AlertDialog.Builder(AdicionarProdutoActivity.this);

                    builder.setTitle("Apagar " + estoque.getNome())
                            .setMessage("Tem certeza que deseja exluir?")
                            .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    deleteProduto(estoque.getIdEstabelecimento());
                                }
                            })
                            .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            })
                            .setIcon(android.R.drawable.ic_dialog_alert)
                            .show();

                }
            });

            return listViewItem;
        }
    }
    }

