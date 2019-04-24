package com.example.projekti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class HakuActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "huu";

    //ArrayList lista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haku);

        TextView tv = findViewById(R.id.textView2);
        EditText edit = findViewById(R.id.editText);
        Button l = findViewById(R.id.button);



    }
    public void hakuMessage(View view){
        Intent haku = new Intent(this, hakuTulosActivity.class);
        EditText haku1 = (EditText) findViewById(R.id.editText);
        String sana = haku1.getText().toString();
        haku.putExtra(EXTRA_MESSAGE, sana);
        startActivity(haku);
    }
    public void takaisin(View v){
        Intent takaisinButton = new Intent(this, MainActivity.class);
        startActivity(takaisinButton);
    }
}
