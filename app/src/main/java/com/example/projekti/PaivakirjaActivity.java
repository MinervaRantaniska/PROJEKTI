package com.example.projekti;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PaivakirjaActivity extends AppCompatActivity {

    public static final String MESSAGE_FROM_PAIVAKIRJA = "key4";

    ListView paivaKirjaListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paivakirja);


        paivaKirjaListView = findViewById(R.id.paivaKirjaListView);


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(PaivakirjaActivity.this,  //adapteri päiväkirjalistalle
                android.R.layout.simple_expandable_list_item_1,

                MyDiaryNotes.getInstance().getMySelectedDiaryArrayList()

        );
        paivaKirjaListView.setAdapter(arrayAdapter);


        paivaKirjaListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent openPaivaKirjaMerkinta = new Intent(PaivakirjaActivity.this, PaivaKirjaMerkinta.class);
                openPaivaKirjaMerkinta.putExtra(MESSAGE_FROM_PAIVAKIRJA, i);
                startActivity(openPaivaKirjaMerkinta);
            }

        });
    }

    public void sendNote(View v) {
        Intent intent = new Intent(this, PaivaKirjaMerkinta.class);
        startActivity(intent);
    }
    public void toMenu(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void toHaku(View v){
        Intent intent = new Intent(this, HakuActivity.class);
        startActivity(intent);
    }
    public void toOma(View v){
        Intent intent = new Intent(this, OmalistaActivity.class);
        startActivity(intent);
    }


}
