package com.example.projekti;

import java.util.ArrayList;
import java.util.Collections;

public class RuokaAineLista {
    public static final String PREF_SAVE = "huuluu";
    private static final RuokaAineLista ourInstance = new RuokaAineLista();
    private ArrayList<String> ruokaAineetArrayList;

    private RuokaAineLista() {

        ruokaAineetArrayList = new ArrayList<>();

        ruokaAineetArrayList.add("omena");
        ruokaAineetArrayList.add("aprikoosi");
        ruokaAineetArrayList.add("greippi");
        ruokaAineetArrayList.add("avokado");
        ruokaAineetArrayList.add("banaani, kypsä");
        ruokaAineetArrayList.add("boysenmarja");
        ruokaAineetArrayList.add("granaattiomena");
        ruokaAineetArrayList.add("kookospähkinä");
        ruokaAineetArrayList.add("mustaherukka");
        ruokaAineetArrayList.add("rambutaani");
        ruokaAineetArrayList.add("tyrni");
        ruokaAineetArrayList.add("karhunvatukka");
        ruokaAineetArrayList.add("litsi");
        ruokaAineetArrayList.add("kirsikka");
        ruokaAineetArrayList.add("taateli");
        ruokaAineetArrayList.add("viikuna");
        ruokaAineetArrayList.add("longaani");
        ruokaAineetArrayList.add("mango");
        ruokaAineetArrayList.add("nektariini");
        ruokaAineetArrayList.add("persikka");
        ruokaAineetArrayList.add("päärynä");
        ruokaAineetArrayList.add("persimon");
        ruokaAineetArrayList.add("luumu");
        ruokaAineetArrayList.add("tamarillo");
        ruokaAineetArrayList.add("vesimeloni");
        ruokaAineetArrayList.add("rusina");
        ruokaAineetArrayList.add("mustikka");
        ruokaAineetArrayList.add("vadelma");
        ruokaAineetArrayList.add("mansikka");
        ruokaAineetArrayList.add("maa-artisokka");
        ruokaAineetArrayList.add("latva-artisokka");
        ruokaAineetArrayList.add("okra");
        ruokaAineetArrayList.add("kurpitsa");
        ruokaAineetArrayList.add("tankoparsa");
        ruokaAineetArrayList.add("parsa");
        ruokaAineetArrayList.add("parsakaali");
        ruokaAineetArrayList.add("kukkakaali");
        ruokaAineetArrayList.add("ruusukaali");
        ruokaAineetArrayList.add("taaro");
        ruokaAineetArrayList.add("savojinkaali");
        ruokaAineetArrayList.add("kaali, kaikki");
        ruokaAineetArrayList.add("varsiselleri");
        ruokaAineetArrayList.add("fenkoli");
        ruokaAineetArrayList.add("valkosipuli");
        ruokaAineetArrayList.add("purjo");
        ruokaAineetArrayList.add("sipuli, kaikki");
        ruokaAineetArrayList.add("aurinkokuivattu tomaatti");
        ruokaAineetArrayList.add("sieni, kaikki");
        ruokaAineetArrayList.add("tomaatti, paseerattu");
        ruokaAineetArrayList.add("bataatti");
        ruokaAineetArrayList.add("punajuuri");
        ruokaAineetArrayList.add("maissi, tuore");
        ruokaAineetArrayList.add("hapankerma");
        ruokaAineetArrayList.add("piimä");
        ruokaAineetArrayList.add("raejuusto");
        ruokaAineetArrayList.add("maito, lehmän");
        ruokaAineetArrayList.add("maito, vuohen");
        ruokaAineetArrayList.add("maito, lampaan");
        ruokaAineetArrayList.add("kerma");
        ruokaAineetArrayList.add("tuorejuusto");
        ruokaAineetArrayList.add("vanukas");
        ruokaAineetArrayList.add("kermajuusto");
        ruokaAineetArrayList.add("maitojauhe");
        ruokaAineetArrayList.add("halloumi");
        ruokaAineetArrayList.add("soijajogurtti");
        ruokaAineetArrayList.add("soijamaito");
        ruokaAineetArrayList.add("soiakerma");
        ruokaAineetArrayList.add("maitotiiviste");
        ruokaAineetArrayList.add("jogurttijäätelö");
        ruokaAineetArrayList.add("jäätelö");
        ruokaAineetArrayList.add("laktoosi");
        ruokaAineetArrayList.add("ricotta");
        ruokaAineetArrayList.add("jogurtti");
        ruokaAineetArrayList.add("maito, kondensoitu");
        ruokaAineetArrayList.add("soijapapu");
        ruokaAineetArrayList.add("soijarouhe");
        ruokaAineetArrayList.add("kikherne");
        ruokaAineetArrayList.add("linssit");
        ruokaAineetArrayList.add("papu");
        ruokaAineetArrayList.add("pavut");
        ruokaAineetArrayList.add("sokeriherne");
        ruokaAineetArrayList.add("herne");
        ruokaAineetArrayList.add("härkäpapu");
        ruokaAineetArrayList.add("bulgur");
        ruokaAineetArrayList.add("durum");
        ruokaAineetArrayList.add("vehnä");
        ruokaAineetArrayList.add("kuskus");
        ruokaAineetArrayList.add("couscous");
        ruokaAineetArrayList.add("mannasuurimo");
        ruokaAineetArrayList.add("ruis");
        ruokaAineetArrayList.add("speltti");
        ruokaAineetArrayList.add("ohra");
        ruokaAineetArrayList.add("kookosjauho");
        ruokaAineetArrayList.add("mantelijauho");
        ruokaAineetArrayList.add("manteli");
        ruokaAineetArrayList.add("cashewpähkinä");
        ruokaAineetArrayList.add("maapähkinä");
        ruokaAineetArrayList.add("hasselpähkinä");
        ruokaAineetArrayList.add("aspartaami");
        ruokaAineetArrayList.add("asesulfaami K");
        ruokaAineetArrayList.add("sakariini");
        ruokaAineetArrayList.add("sukraloosi");
        ruokaAineetArrayList.add("laktitoli");
        ruokaAineetArrayList.add("fruktoosi");
        ruokaAineetArrayList.add("hunaja");
        ruokaAineetArrayList.add("isomalti");
        ruokaAineetArrayList.add("maltitoli");
        ruokaAineetArrayList.add("mannitoli");
        ruokaAineetArrayList.add("melassi");
        ruokaAineetArrayList.add("sorbitoli");
        ruokaAineetArrayList.add("xylitoli");
        ruokaAineetArrayList.add("ksylitoli");
        ruokaAineetArrayList.add("siirappi, kaikki");
        ruokaAineetArrayList.add("agave");
        ruokaAineetArrayList.add("kookossokeri");
        ruokaAineetArrayList.add("kamomillatee");
        ruokaAineetArrayList.add("sikuri");
        ruokaAineetArrayList.add("kaakaojauhe");
        ruokaAineetArrayList.add("voikukka, lehti");
        ruokaAineetArrayList.add("pikakahvi");
        ruokaAineetArrayList.add("inuliini");
        ruokaAineetArrayList.add("purukumi, kaikki");
        ruokaAineetArrayList.add("pastillit");
        ruokaAineetArrayList.add("cayennepippuri");
        ruokaAineetArrayList.add("herbamare");
        ruokaAineetArrayList.add("liemikuutio");

        Collections.sort(ruokaAineetArrayList);


    }

    public static RuokaAineLista getInstance() {
        return ourInstance;
    }


    public ArrayList<String> getRuokaAineet() {
        return ruokaAineetArrayList;
    }

    public String getRuokaAineet(int i) {
        return ruokaAineetArrayList.get(i);
    }

    public void addToRuokaAineList(String name) {
        ruokaAineetArrayList.add(name);
        Collections.sort(ruokaAineetArrayList);
    }
}
