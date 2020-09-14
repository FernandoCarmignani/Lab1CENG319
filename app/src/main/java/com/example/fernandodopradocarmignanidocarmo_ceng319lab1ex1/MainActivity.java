package com.example.fernandodopradocarmignanidocarmo_ceng319lab1ex1;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String[]  Activities = {"AIActivity","VRActivity"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter LISTADP = new ArrayAdapter<String>(this, R.layout.activity_listview, Activities);

        ListView newlist = (ListView) findViewById(R.id.Act_List);
        newlist.setAdapter(LISTADP);



    }

}
