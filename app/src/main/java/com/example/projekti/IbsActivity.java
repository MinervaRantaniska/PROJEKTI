package com.example.projekti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class IbsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {   //faktatietoa ibs:stä
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ibs);
        TextView tv = findViewById(R.id.textViewForIbs);
        tv.setMovementMethod(new ScrollingMovementMethod());
        tv.setText("Ärtyvän suolen oireyhtymä eli IBS ei ole sairaus, vaan pikemminkin toiminnallinen vaiva, jota esiintyy ainakin yhdellä kymmenestä suomalaisesta, enemmän naisilla kuin miehillä. Vaiva voi olla pitkäaikainen ja kiusallinen, mutta se on onneksi täysin vaaraton. Ärtyvän suolen oireyhtymän syytä ei toistaiseksi tunneta.\n" +
                "\n" +
                "Ärtyvä suoli oireilee vatsakipuina, turvotteluna sekä erilaisina suolen toiminnan muutoksina, mutta mitään elimellistä vikaa ei esimerkiksi röntgenkuvissa tai suolen tähystyksissä löydy. Ummetusta ja ripulia esiintyy toisilla vuorotellen, joillakin pääasiallisesti jompaakumpaa. Vatsakivut voivat helpottaa ulostamisen jälkeen, ja toisaalta voi tuntua, ettei suoli täysin tyhjene ulostaessa. Oireet voivat esiintyä varsin vaihtelevasti päivästä ja viikosta toiseen.\n" +
                "\n" +
                "Ärtyvästä suolesta kärsivillä voi esiintyä tavallista enemmän myös unihäiriöitä ja masentuneisuutta, ja stressi voi pahentaa oireita. Ärtyvän suolen oireyhtymä diagnosoidaan sulkemalla pois muut samanlaisia oireita aiheuttavat sairaudet. Oireista sekä muista epäillyistä sairauksista riippuen voidaan esimerkiksi tehdä verikokeita, ottaa ulostenäyte tai tehdä kolonoskopia eli paksusuolentähystys.\n" +
                "\n" +
                "Ärtyvään suoleen ei ole parantavaa hoitoa, ja hoidon tavoitteena on vähentää oireita. Itsehoidolla, etenkin ruokavaliolla, voidaan helpottaa oireilua (kts. alta FODMAP). Monilla tietyt ruoka-aineet, esimerkiksi kahvi, alkoholi, mausteiset ruuat ja maitotuotteet aiheuttavat ongelmia. Ummetukseen voi kokeilla apteekista saatavia suolen sisältöä lisääviä liukoisia kuituvalmisteita, kuten pellavansiemeniä. Liukenemattomia kuituja, kuten vehnäleseitä, ei pidä käyttää. Ummetuksen hoitoa voidaan tehostaa lääkärin määräämillä lääkkeillä.\n" +
                "\n" +
                "FODMAP-ruokavalio ja gluteeniton ruokavalio\n" +
                "\n" +
                "Ärtyvän suolen oireisiin voi kokeilla FODMAP-ruokavaliota, jossa rajoitetaan ns. FODMAP-hiilihydraattien päivittäistä saantia yksilöllisen sietokyvyn mukaan. FODMAP-hiilihydraateilla (fermentable oligo-, di-, mono- and polysaccharides) tarkoitetaan fermentoituvia hiilihydraatteja, joita on mm. palkokasveissa, sienissä ja tietyissä hedelmissä. Gluteenittomat viljatuotteet usein sopivat paremmin, koska myös vehnä, ruis ja ohra sisältävät FODMAP-hiilihydraatteja. Helpommin sulavia viljoja ovat kaura, speltti, hirssi ja riisi sekä viljojen tapaan käytettävät kvinoa, tattari ja amarantti. Gluteenittomuus itsessään ei ole tärkeää, ellei samalla satu sairastamaan keliakiaa. Toisaalta gluteenittomuudesta ei ole haittaakaan, jos ruokavalio on monipuolisesti koostettu.\n" +
                "\n" +
                "Myös laktoosi ja makeutusaineina käytetyt sokerialkoholit ovat fermentoituvia hiilihydraatteja. Allergioista ja keliakiasta poiketen mitään ruoka-ainetta ei tarvitse välttää kokonaan. Riittää, kun FODMAP-kuorma ateriaa ja päivää kohden pysyy kohtuullisella tasolla. Muutenkin on hyvin yksilöllistä, mitkä ruoka-aineet itse kullekin aiheuttavat oireita. Ruokavalion monipuolisuus on IBS:ää sairastavalle se kaikkein olennaisin tekijä. Jos FODMAP-kokeilu kiinnostaa, aiheeseen kannattaa ensin perehtyä lisää ja hakeutua FODMAP-ruokavalio-ohjausta tekevän ravitsemusterapeutin vastaanotolle.\n" +
                "\n" +
                "\n\n\n\n");
    }
    public void toMain(View v){
        Intent openMain = new Intent(IbsActivity.this, MainActivity.class);
        startActivity(openMain);
    }

}


