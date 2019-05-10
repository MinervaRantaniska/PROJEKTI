package com.example.projekti;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class OmalistaActivity extends AppCompatActivity {

    //ArrayList<String> myFodmapArrayList = new ArrayList<>();


    public static final String MESSAGE_FROM_OMALISTA = "key2";

    /**
     * 1. serialized object = mySelected list can be saved also in a file and can be retrieved from there (deserialize)
     * single variable stored in shared prefs has a size limit, file has not
     * database hard this faster!
     * chech if contains , add if not
     * mainActivity -> mylist -> print out from shared prefs
     *
     * @param savedInstanceState
     */

    //ArrayAdapter<String> addingAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_omalista);

        ListView myFodmapListListView = findViewById(R.id.omaListaListView);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(OmalistaActivity.this,  //vastaanottaja adapteri omalle listalle
                android.R.layout.simple_list_item_1,
                MySelectedItems.getInstance().getMySelectedItemsArrayList()
        );


        myFodmapListListView.setAdapter(arrayAdapter);


        myFodmapListListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent openhakuTulosActivity = new Intent(OmalistaActivity.this, hakuTulosActivity.class);

                openhakuTulosActivity.putExtra(MESSAGE_FROM_OMALISTA, i);
                startActivity(openhakuTulosActivity);
            }
        });

    }

    public void takaisin(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

    public void toSearchButton(View view) {
        Intent intent = new Intent(this, HakuActivity.class);
        startActivity(intent);

    }

}