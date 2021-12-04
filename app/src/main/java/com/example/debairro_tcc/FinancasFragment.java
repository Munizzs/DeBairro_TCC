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
 * Use the {@link FinancasFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FinancasFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Button adicionarfinancas, visualizarfinancas, despesasfinancas;

    public FinancasFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FinancasFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FinancasFragment newInstance(String param1, String param2) {
        FinancasFragment fragment = new FinancasFragment();
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
        View view = inflater.inflate(R.layout.fragment_financas_layout, container, false);

        adicionarfinancas = view.findViewById(R.id.btn_adicionarFinancas);
        adicionarfinancas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),FinacasAcitivity.class));
            }
        });

        visualizarfinancas = view.findViewById(R.id.btn_visualizarFinancas);
        visualizarfinancas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),FinacasAcitivity.class));
            }
        });

        despesasfinancas = view.findViewById(R.id.btn_despesasFinancas);
        despesasfinancas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),FinacasAcitivity.class));
            }
        });

        return view;

    }
}