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


public class RencontresFragment extends Fragment {
   private String[] tabRencontres ,tabDetails;
   private ListView listRencontres;
   private String rencontres, details;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_rencontres, container, false);
        listRencontres = view.findViewById(R.id.liste_rencontres);
        tabRencontres = view.getResources().getStringArray(R.array.tab_rencontre);
        tabDetails = view.getResources().getStringArray(R.array.rencontre_details);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,tabRencontres);
        listRencontres.setAdapter(adapter);
        listRencontres.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                rencontres = tabRencontres[i];
                details = tabDetails[i];
                AlertDialog.Builder dialog = new AlertDialog.Builder(getActivity());
                dialog.setIcon(R.mipmap.ic_launcher);
                dialog.setTitle(rencontres);
                dialog.setMessage(details);
                dialog.setNegativeButton("Retour",null);
                dialog.show();
            }
        });
        return view;
    }
}