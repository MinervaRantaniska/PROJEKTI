package com.example.projekti;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

public class HakuActivity extends AppCompatActivity {

    public static final String MESSAGE_FROM_HAKU = "key1";


    SearchView ruokaSearchView;
    ListView ruokaListView;
    EditText addToOwnList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haku);

        ruokaListView = (ListView) findViewById(R.id.ruokaListaHakuActivity);        //activityn listan esittely

        ruokaSearchView = (SearchView) findViewById(R.id.searchViewRuokaHaku);      //activityn searchViewn esittely


        final ArrayAdapter<String> arrayAdapterOma = new ArrayAdapter<String>(           //listan adapteri hakee kaikki singeltonin ruoka-aineet listaan
                this,
                android.R.layout.simple_list_item_1,
                RuokaAineLista.getInstance().getRuokaAineet()
        );


        ruokaListView.setAdapter(arrayAdapterOma);


        ruokaSearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {   //
            @Override
            public boolean onQueryTextSubmit(final String query) {
                if(RuokaAineLista.getInstance().getRuokaAineet().contains(query)){   //etsii haulla listasta löytyykö
                    arrayAdapterOma.getFilter().filter(query);

                    ruokaListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                            Intent openAddActivity = new Intent(HakuActivity.this, AddItemToMyListActivity.class); //klikattavana, jos löytyy

                            openAddActivity.putExtra(MESSAGE_FROM_HAKU, query);   //
                            startActivity(openAddActivity);
                        }
                    });

                }else {
                    Toast toast = Toast.makeText(HakuActivity.this, "Ei löydy\nLisää itse!", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                    toast.show();
                    //jos listasta ei haulla löydy, lähettää toast-viestin

                }

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

        ruokaListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent openAddActivity = new Intent(HakuActivity.this, AddItemToMyListActivity.class);  //lähettää listasta klikatun ruoka-aineen hakutulosActivityyn

                openAddActivity.putExtra(MESSAGE_FROM_HAKU, i);
                startActivity(openAddActivity);
            }
        });
    }

    public void addToOwnList(View view) {
        Intent intent = new Intent(this, AddItemToMyListActivity.class);   //oman ruoka-aineen (itse kirjoitetun) lisäävä nappi (ruoka-aine menee hakutulosactivityyn)
        addToOwnList = (EditText) findViewById(R.id.AddToOwnListEditText);
        String addingFodmap = addToOwnList.getText().toString();
        intent.putExtra(MESSAGE_FROM_HAKU, addingFodmap);
        startActivity(intent);
    }
    public void toMenu(View v){
        Intent intent = new Intent(this, MainActivity.class);   //takaisin etusivulle
        startActivity(intent);
    }
    public void toP_kirja(View v){
        Intent intent = new Intent(this, PaivakirjaActivity.class);     //pääsy päiväkirjaan
        startActivity(intent);
    }
    public void toOma(View v){
        Intent intent = new Intent(this, OmalistaActivity.class);       //pääsy omana listaan
        startActivity(intent);
    }
}