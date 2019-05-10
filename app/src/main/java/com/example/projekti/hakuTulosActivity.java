package com.example.projekti;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;
import java.util.ArrayList;


public class hakuTulosActivity extends AppCompatActivity {


    String redColor = "red";
    String yellowColor = "yellow";
    String greenColor = "green";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haku_tulos);


        Bundle b = getIntent().getExtras();
        // int i = b.getInt(HakuActivity.MESSAGE_FROM_HAKU, -1);       //listasta haetun ja klikatun vastaanottaminen
        int j = b.getInt(OmalistaActivity.MESSAGE_FROM_OMALISTA, -1);

        if (j != -1) {

            TextView tvUp = findViewById(R.id.textView7);
            tvUp.setText(MySelectedItems.getInstance().getMySelectedItemsArrayList(j));
            String retrieveColor = MySelectedFodmapsColors.getInstance().getMySelectedFodmapsColorsArrayList(j);
            if(retrieveColor.equals(redColor)){
                tvUp.setTextColor(Color.RED);
            }
            if(retrieveColor.equals(yellowColor)){
                tvUp.setTextColor(Color.parseColor("#FFF4C107"));
            }
            if(retrieveColor.equals(greenColor)){
                tvUp.setTextColor(Color.parseColor("#FF10BB32"));
            }

            boolean emptyList=true;
            emptyList = MySelectedFodmapsNotes.getInstance().getMySelectedFodmapsNotesArrayList().isEmpty();
            if(emptyList==false){
                TextView tvForNotes = findViewById(R.id.textView9);
                String retrieveNote = MySelectedFodmapsNotes.getInstance().getMySelectedFodmapsNotesArrayList(j);

                tvForNotes.setText(retrieveNote);
                //tvForNotes.setText("Lisää muistiinpano");
            }

        }

    }

    public void poistaOmastaListasta(View view) {  //nappula, joka poistaa valitun tuotteen omasta listasta ja tallentaa, ettei tuotetta enää ole
        Bundle b = getIntent().getExtras();
        int j = b.getInt(OmalistaActivity.MESSAGE_FROM_OMALISTA, 0);

        String myListmuuttuja1 = MySelectedItems.getInstance().getMySelectedItemsArrayList(j);
        MySelectedItems.getInstance().removeFromMyList(myListmuuttuja1);

        SharedPreferences prefs = getSharedPreferences(MySelectedItems.PREFS_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        try {
            editor.putString("TASKS", ObjectSerializer.serialize(MySelectedItems.getInstance().getMySelectedItemsArrayList()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        editor.commit();

        Intent avaaOmalista = new Intent(this, OmalistaActivity.class);
        avaaOmalista.putExtra(MainActivity.EXTRA, j);
        startActivity(avaaOmalista);

    }

    public void toBackSearch(View view) {  //takaisin HakuActivityyn Button
        Intent intent = new Intent(this, HakuActivity.class);
        startActivity(intent);
    }
    public void toBackOma(View view) {  //takaisin HakuActivityyn Button
        Intent intent = new Intent(this, OmalistaActivity.class);
        startActivity(intent);
    }

    public void addNote(View v){
        /**
         * checks the index of the item on the textview.
         *
         *
         */
        //boolean input = true;
        TextView tv = findViewById(R.id.textView7);
        String itemOnTextView = tv.getText().toString();

        int indexOfItem = MySelectedItems.getInstance().getIndex(itemOnTextView);

        EditText noteOnEditActivity = findViewById(R.id.editActivityEditTextSetNote);
        String userInputNote = noteOnEditActivity.getText().toString();
        TextView tv2 = findViewById(R.id.textView9);
        tv2.setText(userInputNote);
        noteOnEditActivity.setText("");     //tyhjentää plainText-kentän, kun merkintä lisätty

        MySelectedFodmapsNotes.getInstance().addNote(indexOfItem, userInputNote);

        SharedPreferences prefNotes = getSharedPreferences(MySelectedFodmapsNotes.PREFS_NOTES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefNotes.edit();
        try {
            editor.putString("NOTES", ObjectSerializer.serialize(MySelectedFodmapsNotes.getInstance().getMySelectedFodmapsNotesArrayList()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        editor.commit();
    }
    public void deleteNote(View view){
        TextView tv = findViewById(R.id.textView7);
        String itemOnTextView = tv.getText().toString();

        int indexOfItem = MySelectedItems.getInstance().getIndex(itemOnTextView);

        //EditText noteOnEditActivity = findViewById(R.id.editActivityEditTextSetNote);
        String userInputNote = "";
        TextView tv2 = findViewById(R.id.textView9);
        tv2.setText(userInputNote);

        MySelectedFodmapsNotes.getInstance().addNote(indexOfItem, userInputNote);

        SharedPreferences prefNotes = getSharedPreferences(MySelectedFodmapsNotes.PREFS_NOTES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefNotes.edit();
        try {
            editor.putString("NOTES", ObjectSerializer.serialize(MySelectedFodmapsNotes.getInstance().getMySelectedFodmapsNotesArrayList()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        editor.commit();

    }

    public void addRedColorButtonPressed(View v){
        TextView tv = findViewById(R.id.textView7);
        String itemOnTextView = tv.getText().toString();

        int indexOfItem = MySelectedItems.getInstance().getIndex(itemOnTextView);

        MySelectedFodmapsColors.getInstance().addColor(indexOfItem, redColor);

        tv.setTextColor(Color.RED);

        SharedPreferences prefColors = getSharedPreferences(MySelectedFodmapsColors.PREFS_COLORS, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefColors.edit();
        try {
            editor.putString("COLORS", ObjectSerializer.serialize(MySelectedFodmapsColors.getInstance().getMySelectedFodmapsColorsArrayList()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        editor.commit();
    }

    public void addYellowColorButtonPressed(View v){
        TextView tv = findViewById(R.id.textView7);
        String itemOnTextView = tv.getText().toString();

        int indexOfItem = MySelectedItems.getInstance().getIndex(itemOnTextView);

        MySelectedFodmapsColors.getInstance().addColor(indexOfItem, yellowColor);

        tv.setTextColor(Color.parseColor("#FFF4C107"));

        SharedPreferences prefColors = getSharedPreferences(MySelectedFodmapsColors.PREFS_COLORS, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefColors.edit();
        try {
            editor.putString("COLORS", ObjectSerializer.serialize(MySelectedFodmapsColors.getInstance().getMySelectedFodmapsColorsArrayList()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        editor.commit();

        /*Intent openThis = new Intent(this, hakuTulosActivity.class);
        //openThis.putExtra(MainActivity.EXTRA, indexOfItem);
        startActivity(openThis);*/

    }
    public void addGreenColorButtonPressed(View v){
        TextView tv = findViewById(R.id.textView7);
        String itemOnTextView = tv.getText().toString();

        int indexOfItem = MySelectedItems.getInstance().getIndex(itemOnTextView);

        MySelectedFodmapsColors.getInstance().addColor(indexOfItem, greenColor);

        tv.setTextColor(Color.parseColor("#FF10BB32"));

        SharedPreferences prefColors = getSharedPreferences(MySelectedFodmapsColors.PREFS_COLORS, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefColors.edit();
        try {
            editor.putString("COLORS", ObjectSerializer.serialize(MySelectedFodmapsColors.getInstance().getMySelectedFodmapsColorsArrayList()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        editor.commit();

        /*Intent openThis = new Intent(this, hakuTulosActivity.class);
        //openThis.putExtra(MainActivity.EXTRA, indexOfItem);
        startActivity(openThis);*/

    }




}