package com.example.projekti;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PaivaKirjaMerkinta extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paiva_kirja_merkinta);

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy ");  //hakee kyseisen päivän
        Date date = new Date();

        ((EditText) findViewById(R.id.paivaKirjaMerkintaEditText)).setText(dateFormat.format(date)); //heittää kyseisen päivän aina uuteen kirjattavaan


        Bundle b = getIntent().getExtras();
        if (b != null) {
            int i = b.getInt(PaivakirjaActivity.MESSAGE_FROM_PAIVAKIRJA, 0);

            ((TextView) findViewById(R.id.SelectedDiaryNoteTextView)).setText(MyDiaryNotes.getInstance().getMySelectedDiaryArrayList(i)); //kaataa lisätessä merkinnän, mutta avaa klikatun näytölle
            ((EditText) findViewById(R.id.paivaKirjaMerkintaEditText)).setText(MyDiaryNotes.getInstance().getMySelectedDiaryArrayList(i));
        }
    }

    public void tallennaMerkinta(View view) {


        EditText paivaKirjaMerkinta = (EditText) findViewById(R.id.paivaKirjaMerkintaEditText);

        Bundle b = getIntent().getExtras();
        if (b != null) {
            int i = b.getInt(PaivakirjaActivity.MESSAGE_FROM_PAIVAKIRJA, 0);
            String vanhaMerkinta = MyDiaryNotes.getInstance().getMySelectedDiaryArrayList(i); //muokatessa poistaa vanhan merkinnän ennen uuden lisäämistä
            MyDiaryNotes.getInstance().removeFromMyDiary(vanhaMerkinta);
        }

        String uusiMerkinta = paivaKirjaMerkinta.getText().toString();


        MyDiaryNotes.getInstance().addToMyDiary(uusiMerkinta);

        SharedPreferences prefNote = getSharedPreferences(MyDiaryNotes.PREFS_N, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefNote.edit();

        try {
            editor.putString("DIARYNOTE", ObjectSerializer.serialize(MyDiaryNotes.getInstance().getMySelectedDiaryArrayList()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        editor.commit();

        Intent intent = new Intent(this, PaivakirjaActivity.class);
        intent.putExtra(MainActivity.EXTRA, uusiMerkinta);

        startActivity(intent);
    }

    public void deleteNote(View v) {

        Bundle b = getIntent().getExtras();
        int i = b.getInt(PaivakirjaActivity.MESSAGE_FROM_PAIVAKIRJA, 0);

        EditText paivaKirjaMerkinta = (EditText) findViewById(R.id.paivaKirjaMerkintaEditText);

        String editMuuttuja = MyDiaryNotes.getInstance().getMySelectedDiaryArrayList(i);
        MyDiaryNotes.getInstance().removeFromMyDiary(editMuuttuja);

        SharedPreferences prefNote = getSharedPreferences(MyDiaryNotes.PREFS_N, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefNote.edit();
        try {
            editor.putString("TASKS", ObjectSerializer.serialize(MyDiaryNotes.getInstance().getMySelectedDiaryArrayList()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        editor.commit();

        Intent avaaDiary = new Intent(this, PaivakirjaActivity.class);
        avaaDiary.putExtra(MainActivity.EXTRA, i);
        startActivity(avaaDiary);

    }
    public void toMenu(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void toP_kirja(View v){
        Intent intent = new Intent(this, PaivakirjaActivity.class);
        startActivity(intent);
    }



}
