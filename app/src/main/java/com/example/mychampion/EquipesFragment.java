package com.example.mychampion;

import android.app.AlertDialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class EquipesFragment extends Fragment {

    private String[] tabEquipes,tabDetails;
    private ListView listEquipes;
    private String equipes,details;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_equipes, container, false);
        listEquipes = view.findViewById(R.id.liste_equipes);
        tabEquipes = view.getResources().getStringArray(R.array.tab_teams);
        tabDetails = view.getResources().getStringArray(R.array.team_details);
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,tabEquipes);
        listEquipes.setAdapter(adapter);
        listEquipes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               equipes = tabEquipes[i];
               details = tabDetails[i];
                AlertDialog.Builder dialog = new AlertDialog.Builder(getActivity());
                dialog.setIcon(R.mipmap.ic_launcher);
                dialog.setTitle(equipes);
                dialog.setMessage(details);
                dialog.setNegativeButton("Retour",null);
                dialog.show();
            }
        });
        return view;
    }
}