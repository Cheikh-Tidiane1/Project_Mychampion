package com.example.mychampion;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class ResultatFragment extends Fragment {

    private ListView listeResultat;
    private String[] tabresultats;
    private String resultat;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view =  inflater.inflate(R.layout.fragment_resultat, container, false);
       listeResultat = view.findViewById(R.id.liste_resultats);
       tabresultats = getResources().getStringArray(R.array.result);
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,tabresultats);
        listeResultat.setAdapter(adapter);
        return view ;
    }
}