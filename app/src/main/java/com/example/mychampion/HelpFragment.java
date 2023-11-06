package com.example.mychampion;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class HelpFragment extends Fragment {

    private ListView listehelp;
    private String[] tabhelp;
    private String help;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_help, container, false);
        listehelp = view.findViewById(R.id.liste_help);
        tabhelp = getResources().getStringArray(R.array.help);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,tabhelp);
        listehelp.setAdapter(adapter);
        return view ;

    }
}