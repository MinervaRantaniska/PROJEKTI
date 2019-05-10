package com.example.projekti;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;

public class AddItemToMyListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item_to_my_list);

        Intent intent = getIntent();
        String omaTuote = intent.getStringExtra(HakuActivity.MESSAGE_FROM_HAKU);  //oma lisäämän asian syöttäminen tekstikenttään (itse kirjoitetun vastaanottaminen)
        TextView tv = (TextView) findViewById(R.id.textViewAddItemToMyListActivity);
        tv.setText(omaTuote);

        /**
         * receives the bundle with i.
         * i equals the index of the arrayslist either on main fodmap list, or from users own list
         */
        Bundle b = getIntent().getExtras();

        /**
         * i, item from main fodmap list. def value -1 because index strats from 0
         */

        int i = b.getInt(HakuActivity.MESSAGE_FROM_HAKU, -1);

        if (i != -1) {
            ((TextView) findViewById(R.id.textViewAddItemToMyListActivity)).setText(RuokaAineLista.getInstance().getRuokaAineet(i));
        }
    }

    public void addToMyListButtonPressed(View v) {
        /**
         * If the list does not contain the item user wants to add, it is added.
         *
         * if users own list already contains the item user wants to add, it is not added and the
         * user is notified with a message that the list already contains the item.
         *
         */
        TextView tv = (TextView) findViewById(R.id.textViewAddItemToMyListActivity);
        String fodmapItemSelected = tv.getText().toString();


        if (MySelectedItems.getInstance().selectedItemsArrayList.contains(fodmapItemSelected)) {  //lista ei anna lisätä kahta kertaa samaa ruoka-ainetta
            ((TextView) findViewById(R.id.textViewAddItemToMyListActivity)).setText("Listassasi on jo\n " + fodmapItemSelected);

        } else {

            MySelectedItems.getInstance().addToMyList(fodmapItemSelected); //lisää omaan listaan
            int indexOfSelectedItems = MySelectedItems.getInstance().selectedItemsArrayList.lastIndexOf(fodmapItemSelected);

            MySelectedFodmapsNotes.getInstance().addNote(indexOfSelectedItems, "");
            MySelectedFodmapsColors.getInstance().addColor(indexOfSelectedItems, "");

            SharedPreferences prefs = getSharedPreferences(MySelectedItems.PREFS_NAME, Context.MODE_PRIVATE); //tallentaa omaan listaan ruoka-aineen
            SharedPreferences.Editor editor = prefs.edit();
            try {
                editor.putString("TASKS", ObjectSerializer.serialize(MySelectedItems.getInstance().getMySelectedItemsArrayList()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            editor.commit();

            SharedPreferences prefNotes = getSharedPreferences(MySelectedFodmapsNotes.PREFS_NOTES, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor1 = prefNotes.edit();
            try {
                editor.putString("NOTES", ObjectSerializer.serialize(MySelectedFodmapsNotes.getInstance().getMySelectedFodmapsNotesArrayList()));
            } catch (IOException e) {                   //merkinnän tallentaminen
                e.printStackTrace();
            }
            editor1.commit();

            SharedPreferences prefColors = getSharedPreferences(MySelectedFodmapsColors.PREFS_COLORS, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor2 = prefColors.edit();  //värin tallentaminen
            try {
                editor.putString("COLORS", ObjectSerializer.serialize(MySelectedFodmapsColors.getInstance().getMySelectedFodmapsColorsArrayList()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            editor2.commit();


            Intent openMySelectedItemsList = new Intent(this, OmalistaActivity.class);
            //openMySelectedItemsList.putExtra(, fodmapItemSelected);
            startActivity(openMySelectedItemsList);
        }

    }

    public void backToSearch(View v) {
        Intent openSearchActivity = new Intent(this, HakuActivity.class);
        startActivity(openSearchActivity);
    }

    public void toFrontPage(View v) {
        Intent openMainActivity = new Intent(this, MainActivity.class);
        startActivity(openMainActivity);
    }
}
