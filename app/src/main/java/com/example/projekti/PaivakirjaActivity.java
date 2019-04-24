package com.example.projekti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PaivakirjaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paivakirja);
    }

    public void takaisin(View v){
        Intent takaisinButton = new Intent(this, MainActivity.class);
        startActivity(takaisinButton);
    }
}
