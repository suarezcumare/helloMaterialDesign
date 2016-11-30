package com.example.suarezcumare.hellomaterial;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ListaMascotas extends AppCompatActivity {

    SwipeRefreshLayout swipeRefresList;
    ListView myList;
    Adapter apdater;
    String[] listAnimals = getResources().getStringArray(R.array.listAnimals);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_mascotas);

        this.ButtombtnFab();
        swipeRefresList = (SwipeRefreshLayout) findViewById(R.id.swipeRefresList);
        myList = (ListView) findViewById(R.id.myList);


        myList.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, listAnimals));
        swipeRefresList.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                OnRefreshswipeRefresList();

            }
        });

    }


    public void ButtombtnFab(){
        FloatingActionButton btnFab = (FloatingActionButton) findViewById(R.id.btnFab);
        btnFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,getResources().getString(R.string.long_mensaje), Snackbar.LENGTH_SHORT)
                        .setActionTextColor(getResources().getColor(R.color.colorPrimary))
                        .show();
            }
        });

    }

    public void OnRefreshswipeRefresList(){
        myList.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, listAnimals));
        swipeRefresList.setRefreshing(false);
    }
}
