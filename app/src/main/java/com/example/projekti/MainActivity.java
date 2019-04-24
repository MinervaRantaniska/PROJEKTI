package com.example.projekti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton ohjeButton;
    private ImageButton hakuButton;
    private ImageButton omalistaButton;
    private ImageButton paivakirjaButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ohjeButton = (ImageButton) findViewById(R.id.ohjeB);
        hakuButton = (ImageButton) findViewById(R.id.hakuButton);
        omalistaButton = (ImageButton) findViewById(R.id.OmalistaButton);
        paivakirjaButton = (ImageButton) findViewById(R.id.paivakirjaButton);
    }

    public void ohjeB(View view){
        Intent intent = new Intent(this, OhjeActivity.class);
        startActivity(intent);
    }
    public void hakuButton(View view){
        Intent intent1 = new Intent(this, HakuActivity.class);
        startActivity(intent1);
    }
    public void omalistaB(View view){
        Intent intent2 = new Intent(this, OmalistaActivity.class);
        startActivity(intent2);
    }
    public void paivakirjaB(View view){
        Intent intent3 = new Intent(this, PaivakirjaActivity.class);
        startActivity(intent3);
    }
}
