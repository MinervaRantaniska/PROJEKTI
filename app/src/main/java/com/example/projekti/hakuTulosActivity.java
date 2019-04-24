package com.example.projekti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class hakuTulosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haku_tulos);

        Intent intent1 = getIntent();
        String message = intent1.getStringExtra(HakuActivity.EXTRA_MESSAGE);

        TextView textv = findViewById(R.id.textView7);
        textv.setText(message);
    }
}
