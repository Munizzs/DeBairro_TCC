package com.example.debairro_tcc;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NotificacoesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NotificacoesFragment extends Fragment {


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private Button maquina, funcionario, conta, addfuncionario, idioma, moeda, suporte, sobre;


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public NotificacoesFragment() {
        // Required empty public constructor
    }


    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment NotificacoesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static NotificacoesFragment newInstance(String param1, String param2) {
        NotificacoesFragment fragment = new NotificacoesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_notificacoes_layout, container, false);

        maquina = view.findViewById(R.id.btn_Maquina);
        maquina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), MaquinaCadastradaActivity.class));
            }
        });

        conta = view.findViewById(R.id.btn_Conta);
        conta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), InformacoesUsuarioActivity.class));
            }
        });

        funcionario = view.findViewById(R.id.btn_Funcionarios);
        funcionario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), AlterarPermissoesActivity.class));
            }
        });

        addfuncionario = view.findViewById(R.id.btn_Addfuncionarios);
        addfuncionario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), AdicionarFuncionarioActivity.class));
            }
        });

        idioma = view.findViewById(R.id.btn_Idioma);
        idioma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), IdiomaActivity.class));
            }
        });

        moeda = view.findViewById(R.id.btn_Moeda);
        moeda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), MoedaLayout.class));
            }
        });

        suporte = view.findViewById(R.id.btn_Suporte);
        suporte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), SuporteConfiguracaoActivity.class));
            }
        });

        sobre = view.findViewById(R.id.btn_Sobre);
        sobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), ConfiguracaoSobreActivity.class));
            }
        });

        return view;
    }
}