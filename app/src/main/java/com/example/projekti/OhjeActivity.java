package com.example.projekti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class OhjeActivity extends AppCompatActivity {  //ohje apin käytölle

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ohje);
        TextView tv = findViewById(R.id.textViewGuide);
        tv.setMovementMethod(new ScrollingMovementMethod());
        tv.setText("Tätä FODMAP -sovellusta voit käyttää hyödyksi eliminoidessasi ruoka-aineita, jotka tunnetusti sisältävät fermentoituvia hiilihydraatteja. Aluksi voit ruokavaliossasi hyödyntää resepteistä löytyviä ruokia, jossa fermentoituvat hiilihydraatit on jätetty pois. Jos toiminnalliset vatsavaivat helpottavat voi hakulistasta löytyviä ruoka-aineita kokeilla yksitellen ja oireita seuraamalla pohtia, sopiiko kyseinen ruoka-aine juuri sinulle. Voit lisätä ruoka-aineita omaan listaasi muistiin, ja kommentoida niiden aiheuttamia oireita tai vastaavasti, jos oireita ei ilmene. Vielä yksinkertaisemmin voit merkitä ruoka-aineen värikoodeilla; sopii, ei sovi tai epävarma. Helpotus vatsan hyvinvointiin selviää ainoastaan karsimalla ja kokeilemalla. \n" +
                "\n\nTsemppiä! \n" +
                "Minerva & Viivi\n\n\n\n");
    }



    public void toMenu(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
