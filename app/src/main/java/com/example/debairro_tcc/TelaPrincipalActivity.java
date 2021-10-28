package com.example.debairro_tcc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class TelaPrincipalActivity extends AppCompatActivity {
    BottomNavigationView bnTelaPrincipal;
    private Toolbar tbTelaPrincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_DeBairro_TCC);
        setContentView(R.layout.tela_principal_layout);
        bnTelaPrincipal = findViewById(R.id.bn_telaPrincipal);
        getSupportFragmentManager().beginTransaction().replace(R.id.body_container, new VendasFragment()).commit();
        bnTelaPrincipal.setSelectedItemId(R.id.nav_vendas);








        //setando a ação de clique nos ícones da action bar
        bnTelaPrincipal.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;

                switch (item.getItemId()){

                    case R.id.nav_vendas:
                        fragment = new VendasFragment();
                        break;
                    case R.id.nav_estoque:
                        fragment = new EstoqueFragment();
                        break;
                    case R.id.nav_clientes:
                        fragment = new ClientesFragment();
                        break;
                    case R.id.nav_financas:
                        fragment = new FinancasFragment();
                        break;
                    case R.id.nav_notificacoes:
                        fragment = new NotificacoesFragment();
                        break;

                }

                getSupportFragmentManager().beginTransaction().replace(R.id.body_container, fragment).commit();

                return true;
            }
        });
    }

    //setando Toolbar

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_top, menu);
        return true;
    }
}