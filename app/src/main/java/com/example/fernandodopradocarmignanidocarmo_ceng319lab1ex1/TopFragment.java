package com.example.fernandodopradocarmignanidocarmo_ceng319lab1ex1;

import android.os.Bundle;

import androidx.fragment.app.ListFragment;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TopFragment extends ListFragment {
    String[] Activities = {"AIActivity", "VRActivity"};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View newv = inflater.inflate(R.layout.fragment_top, container, false);

        ArrayAdapter<String> ADP = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Activities);

        setListAdapter(ADP);

        return newv;

    }
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        if (position == 0){
            Intent intn = new Intent(getActivity(),AIAct.class);
        }
        if (position == 1){
            Intent intn =new Intent(getActivity(),VRAct.class);
        }
    }
}