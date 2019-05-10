package com.example.projekti;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;

import java.io.IOException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    public static final String EXTRA = "huu";
    private static boolean ekaKerta = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        if (ekaKerta == true) { //tallentaa vain 1. kerralla avatessa OnCreatin
            ekaKerta = false;

            SharedPreferences prefs = getSharedPreferences(MySelectedItems.PREFS_NAME, Context.MODE_PRIVATE);

            try {
                ArrayList<String> mySelectedBadFodmaps = (ArrayList<String>) ObjectSerializer.deserialize(prefs.getString(
                        "TASKS", ObjectSerializer.serialize(new ArrayList<String>())));
                for (String badSelectedFood : mySelectedBadFodmaps) {
                    MySelectedItems.getInstance().addToMyList(badSelectedFood);  //tallennus omalistaan
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            SharedPreferences prefNote = getSharedPreferences(MyDiaryNotes.PREFS_N, Context.MODE_PRIVATE);

            try {
                ArrayList<String> myDiaryNotes = (ArrayList<String>) ObjectSerializer.deserialize(prefNote.getString("DIARYNOTE", ObjectSerializer.serialize(new ArrayList<String>())));

                for (String myD : myDiaryNotes) {
                    MyDiaryNotes.getInstance().addToMyDiary(myD); //tallennus päiväkirjaan
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            SharedPreferences prefColors = getSharedPreferences(MySelectedFodmapsColors.PREFS_COLORS, Context.MODE_PRIVATE);

            try {
                ArrayList<String> myColors = (ArrayList<String>) ObjectSerializer.deserialize(prefColors.getString("COLORS", ObjectSerializer.serialize(new ArrayList<String>())));
                //Log.i("Fodmap", mySelectedBadFodmaps.toString());
                for (String myC : myColors) {
                    MySelectedFodmapsColors.getInstance().addToMyListOfColors(myC); //värin tallentaminen
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            SharedPreferences prefNotes = getSharedPreferences(MySelectedFodmapsNotes.PREFS_NOTES, Context.MODE_PRIVATE);

            try {
                ArrayList<String> myNotes = (ArrayList<String>) ObjectSerializer.deserialize(prefNotes.getString("NOTES", ObjectSerializer.serialize(new ArrayList<String>())));
                //Log.i("Fodmap", mySelectedBadFodmaps.toString());
                for (String myN : myNotes) {
                    MySelectedFodmapsNotes.getInstance().addToMyListOfNotes(myN); //ruoka-aineelle muistiinpanon tallentaminen
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public void ohjeB(View view) {
        Intent intent = new Intent(this, OhjeActivity.class);
        startActivity(intent);
    }

    public void hakuButton(View view) {
        Intent intent1 = new Intent(this, HakuActivity.class);
        startActivity(intent1);
    }

    public void omalistaB(View view) {
        Intent intent2 = new Intent(this, OmalistaActivity.class);
        startActivity(intent2);
    }

    public void paivakirjaB(View view) {
        Intent intent3 = new Intent(this, PaivakirjaActivity.class);
        startActivity(intent3);
    }
    public void ibsButton(View view){
        Intent intent3 = new Intent(this, IbsActivity.class);
        startActivity(intent3);
    }
    public void recipesButtonPressed(View v){
        Intent openRecipes = new Intent(this, RecipesActivity.class);
        startActivity(openRecipes);
    }
  




}
