package com.example.projekti;

import java.util.ArrayList;

class RecipesList {
    private ArrayList<Recipe> recipes;
    private static final RecipesList ourInstance = new RecipesList();

    public static RecipesList getInstance() {
        return ourInstance;
    }

    private RecipesList() {
        recipes = new ArrayList<>();
        recipes.add(new Recipe(
                "pizza",
                "Pohja\n\n" +
                        "15 g hiivaa\n" +
                        "4 dl vettä\n" +
                        "1 muna\n" +
                        "1 rkl rypsiöljyä\n" +
                        "1 dl maissijauhoja\n" +
                        "1 dl riisijauhoja\n" +
                        "1¾ dl tattarijauhoja\n" +
                        "50 g perunajauhoja\n" +
                        "1 tl suolaa\n" +
                        "½ rkl HUSK kuitujauhetta\n\n" +
                        "Ehdotukset täytteeksi\n\n" +
                        "Tomaattipyrettä\n" +
                        "1 pussi vegaanista juustoraastetta\n" +
                        "Kalkkunaa / grillattua kanaa\n/tonnikala / katkarapu" +
                        "Oliiveja\n" +
                        "Ananas\n" +
                        "Tomaatteja\n" +
                        "Rucolaa täytteeksi paistamisen jälkeen\n" +
                        "Oreganoa\n",
                "Sekoita pohjan kaikki ainekset yhteen kulhossa ja anna nousta liinan alla noin 45 minuuttia.\n" +
                        "Kuumenna uuni 245 asteeseen\n" +
                        "Kauli taikina leivinpaperin päällä ja aseta uunipellille. Lisää hieman jauhoja, jos taikina on liian tahmea käsiteltäväksi. Koeta saada pohjasta mahdollisimman ohut.\n" +
                        "Levitä tomaattipyree ja noin puolet juustosta pohjalle.\n" +
                        "Lisää haluamasi täytteet sekä loput juustosta, pippuri ja oregano pinnalle.\n" +
                        "Paista pizzaa, kunnes juusto on sulanut ja väriltään kullanruskea. Noin 12-15 minuuttia\n" +
                        "Ota pizza pois uunista ja viimeistele rucolalla.\n\n\n\n\n"));
        recipes.add(new Recipe(
                "inkivääri-porkkanakeitto",
                "500 g porkkanoita\n" +
                        "1–2 (400 g) palsternakkaaä\n" +
                        "1–2 rkl raastettua inkivääriä\n" +
                        "8 dl vettä\n" +
                        "1 tl suolaa\n" +
                        "1 pkt (349) g pehmeää tofua\n\n" +
                        "Lisäksi:\n" +
                        "hampunsiemenöljyä\n" +
                        "hienonnettua korianteria\n",
                "Pese porkkanat ja palsternakat, kuori ja pilko pieniksi paloiksi. Kuori ja raasta inkivääri.\n"+
                        "Kiehauta vesi kattilassa. Lisää kasvikset, inkivääri ja suola. Keitä noin 15 minuuttia, kunnes kasvikset tuntuvat pehmeiltä. Lisää joukkoon pehmeä tofu.\n"+
                        "Kaada seos tehosekoittimen kulhoon. Soseuta sileäksi keitoksi. Kaada keittoa lautasille. Valuta päälle hampunsiemenöljyä ja hienonnettua korianteria.\n\n\n\n\n"));
        recipes.add(new Recipe(
                "misolohi",
                "600 g lohifileetä\n" +
                        "1/2 tl suolaa\n" +
                        "2 rkl misotahnaa\n" +
                        "2 rkl soijaa (G)\n" +
                        "1 rkl sitruunanmehua\n" +
                        "1 tl kalakastiketta\n" +
                        "1 ps (80 g) babypinaattia\n" +
                        "1/2 dl hienonnettua sipulinvartta tai ruohosipulia\n",
                "Kuumenna uuni 200 asteeseen. Pyyhi lohifileen pinta kuivaksi talouspaperilla. Nosta filee leivinpaperin päälle uunipellille. Ripottele päälle suolaa.\n" +
                        "Sekoita kulhossa misotahna, soija, sitruunanmehu ja kalakastike. Levitä seos lohifileen päälle.\n" +
                        "Huuhtele pinaatit lävikössä tai salaattilingossa. Levitä puolet pinaatinlehdistä kalan päälle. Kypsennä uunin keskitasolla 25 minuuttia.\n" +
                        "Lisää kypsän lohen päälle loput pinaatinlehdet ja hienonnettu sipulinvarsi tai ruohosipuli. Tarjoile lohi keitetyn kvinoan ja perunoiden kanssa.\n\n\n\n\n"));
        recipes.add(new Recipe(
                "broileri-kasvisspagetti",
                "500g porkkanaa\n" +
                        "1 sitruunan raastettu kuori ja mehu\n" +
                        "2 rkl kylmäpuristettua rypsiöljyä\n" +
                        "300 g broilerin fileesuikaleita\n" +
                        "1 tl kurkumaa\n" +
                        "1 tl suolaa\n" +
                        "1 dl raastettua parmesaanijuustoa\n" +
                        "1 dl minttua\n",
                "Pese ja kuori porkkanat. Leikkaa porkkanat kuorimaveitsellä tai julienneveitsellä ohuiksi pitkiksi suikaleiksi.\n" +
                        "Pese sitruuna lämpimällä vedellä. Raasta sitruunasta kuori ja purista mehu.\n" +
                        "Kuumenna öljy paistokasarissa. Lisää pannulle broilerinfileesuikaleet. Paista sekoitellen 6 minuuttia. Mausta kurkumalla ja suolalla. Lisää pannulle kasvikset, sitruunan kuoriraaste- ja mehu. Paista sekoitellen vielä 5 minuuttia, kunnes kasvikset ovat pehmenneet.\n" +
                        "Raasta joukkoon parmesaanijuustoa. Hienonna minttu ja lisää pannulle.\n\n\n\n\n"));
        recipes.add(new Recipe(
                "puolukka-tattarituorepuuro",
                "TATTARISEOS:\n\n" +
                        "2 dl tattarisuurimoita\n" +
                        "2 rkl auringonkukansiemeniä\n" +
                        "2 rkl kuorellisia seesaminsiemeniä\n" +
                        "10 kpl pekaanipähkinää\n" +
                        "10 kpl saksanpähkinää\n" +
                        "2 rkl mulperimarjoja\n\n" +
                        "PELLAVASEOS:\n\n" +
                        "2 rkl pellavansiemeniä\n" +
                        "1 dl vettä\n\n" +
                        "Lisäksi:\n\n" +
                        "2 ½ dl kasvipohjaista jogurttivalmistetta\n" +
                        "2 dl puolukoita\n" +
                        "3 rkl intiaanisokeria\n",
                "Mittaa tattarisuurimot, auringonkukansiemenet, seesaminsiemenet, pähkinät ja mulperimarjat kannelliseen astiaan.\n" +
                        "Lisää tattariseokseen reilusti kylmää vettä, sulje kansi ja nosta kulho jääkaappiin 12 tunniksi.\n" +
                        "Laita pellavansiemenet tekeytymään eri kulhoon pieneen vesimäärään 12 tunniksi. Pellavansiemenistä muodostuu geeliytyvää kuitua, joka tekee vatsalle hyvää edistäen vatsan toimintaa.\n" +
                        "Kaada tattariseoksen liotusvesi pois siivilän läpi ja huuhtele kevyesti. Kumoa puuroainekset takaisin kulhoon.\n" +
                        "Lisää geeliytyneet pellavansiemenet. Älä huuhtele pellavansiemeniä.\n" +
                        "Mittaa puuroainesten sekaan kasvipohjainen jogurtti, karpalot/puolukat ja intiaanisokeri.\n" +
                        "Jauha kaikki ainekset kuohkeaksi puuroksi sauvasekoittimella. Lisää makeutusta tarvittaessa.\n" +
                        "Viimeistele puuroannoksesi hedelmillä ja marjoilla.\n\n\n\n\n"));
        recipes.add(new Recipe(
                "karpalo-kauratuorepuuro",
                "2 dl kaurahiutaleita\n" +
                        "2 rkl auringonkukansiemeniä\n" +
                        "2 rkl kuorellisia seesaminsiemeniä\n" +
                        "10 kpl pekaanipähkinää\n" +
                        "10 kpl saksanpähkinää\n" +
                        "2 rkl mulperimarjoja\n\n" +
                        "PELLAVASEOS:\n\n" +
                        "2 rkl pellavansiemeniä\n" +
                        "1 dl vettä\n\n" +
                        "Lisäksi:\n\n" +
                        "2 ½ dl kasvipohjaista jogurttivalmistetta\n" +
                        "2 dl puolukoita\n" +
                        "3 rkl intiaanisokeria\n",
                "Mittaa kaurahiutaleet, auringonkukansiemenet, seesaminsiemenet, pähkinät ja mulperimarjat kannelliseen astiaan.\n" +
                        "Lisää tattariseokseen reilusti kylmää vettä, sulje kansi ja nosta kulho jääkaappiin 12 tunniksi.\n" +
                        "Laita pellavansiemenet tekeytymään eri kulhoon pieneen vesimäärään 12 tunniksi. Pellavansiemenistä muodostuu geeliytyvää kuitua, joka tekee vatsalle hyvää edistäen vatsan toimintaa.\n" +
                        "Lisää geeliytyneet pellavansiemenet. Älä huuhtele pellavansiemeniä.\n" +
                        "Mittaa puuroainesten sekaan kasvipohjainen jogurtti, karpalot/puolukat ja intiaanisokeri.\n" +
                        "Jauha kaikki ainekset kuohkeaksi puuroksi sauvasekoittimella. Lisää makeutusta tarvittaessa.\n" +
                        "Viimeistele puuroannoksesi hedelmillä ja marjoilla.\n\n\n\n\n"));
        recipes.add(new Recipe(
                "teriyaki-nuudeliwokki ",
                "n. 120 g riisnuudeleita\n" +
                        "125g tempeä/kanaa/katkarapuja\n" +
                        "1 rkl öljyä\n" +
                        "200 g munakoiso\n" +
                        "1 iso porkkana\n" +
                        "½ punainen paprika\n" +
                        "1 iso kourallinen tuoretta pinaattia\n\n" +
                        "Teriyakikastike\n\n" +
                        "3 rkl soijakastiketta\n" +
                        "2 rkl riisiviinietikkaa tai omenaviinietikkaa\n" +
                        "1 rkl miriniä\n\n",
                "Keitä nuudelit paketin ohjeen mukaan. Valuta.\n" +
                        "Murenna tempe paloiksi/pilko kana ja paista pannulla öljyssä. Pilko munakoiso reiluiksi paloiksi ja laita pannulle paistumaan tempen kanssa. Paista, kunnes saavat hieman väriä.\n" +
                        "Kuori porkkana ja leikkaa se kuorimaveitsellä ohuiksi suikaleiksi. Pilko paprika paloiksi ja huuhtele pinaatti. Lisää loput kasvikset pannulle tempen ja munakoison kanssa. Lisää myös nuudelit pannulle ja paista kunnes pinaatti on pehmennyt.\n" +
                        "\n" +
                        "Sekoita teriyakikastikkeen ainekset keskenään. Nosta pannu levyltä, kaada kastike pannulle ja sekoita kunnes kastike on imeytynyt.\n\n\n\n\n"));
        recipes.add(new Recipe(
                "broileri-riisivuoka",
                "3 ½ dl pitkäjyväistä riisiä\n" +
                        "1 paprika\n" +
                        "200 g porkkanaa\n" +
                        "450 g broilerin fileesuikaleita\n" +
                        "8 dl vettä\n" +
                        "1 kanaliemikuutio (G)\n" +
                        "2 prk (à 2,5 dl kaurakermaa\n" +
                        "½ pussia (à 150 g) gouda raastetta" +
                        "(mausteita maun mukaan)\n\n",
                "Mittaa riisit isoon (vähintään 3 l), voideltuun vuokaan. Lisää kuutioitu paprika, porkkana ja broilerifileesuikaleet. Sekoita ainekset.\n" +
                        "Liuota kiehuvaan veteen liemikuutio. Lisää kaurakerma. Kaada nesteseos vuokaan ja sekoita vielä Paista uunissa 200 asteessa n. 1 h.\n" +
                        "Ripottele pinnalle juustoraastetta paiston puolivälissä, kun vuoka on jo hiukan kiinteämpää.\n\n\n\n\n"));
        recipes.add(new Recipe(
                "äyriäisrisotto",
                "2 dl risottoriisiä\n" +
                        "1 dl kevätsipulin vihreää osaa" +
                        "1 rkl oliiviöljyä\n" +
                        "1 rkl voita\n" +
                        "5 dl kalalientä\n" +
                        "2 dl kuivaa valkoviiniä\n" +
                        "suolaa mustapippuria\n" +
                        "nokare voita\n" +
                        "200 g katkarapuja ja simpukoita\n" +
                        "parmesaanijuustoraastetta\n\n",
                "Pilko sipulinvarret, kuumenna öljy ja voi kattilassa ja pyöräytä varret pannulla.\n" +
                        "Lisää riisit ja kuumenna, kunnes muuttuvat lasimaisiksi.\n" +
                        "Lisää lientä ja viiniä pienissä erissä ja anna nesteen lisäysten välillä imeytyä riisiin. Kypsennä hyvällä lämmöllä. Risottoriisi kypsyy noin 18 minuutissa ja se saa jäädä kiinteäksi.\n" +
                        "Sekoita joukkoon sulaneet äyriäiset.\n" +
                        "Lisää parmesaanijuustoraaste.\n" +
                        "Tarkista maku ja kuumenna kiehuvaksi. Voit vielä lisätä risottoon nokareen voita ja nestettä, jos rakenne tuntuu liian kiinteältä.\n\n\n\n\n"));
        recipes.add(new Recipe(
                "kookosriisipuuro",
                "2dl puuroriisiä\n" +
                        "2dl vettä\n" +
                        "1tlk(400 ml) kookosmaitoa\n" +
                        "4dl vettä\n" +
                        "1/2tl suolaa",
                "Mittaa riisi ja 2 dl vettä paksupohjaiseen kattilaan. Kuumenna kiehuvaksi ja keitä, kunnes neste on lähes kokonaan imeytynyt riisiin.\n" +
                        "Lisää kookosmaito ja vesi (noin 4 dl). Keitä riisipuuroa miedolla lämmöllä noin 50 minuuttia välillä sekoittaen,\n" +
                        "kunnes puuro on sopivan paksua. Mausta puuro suolalla.\n" +
                        "Tarjoa riisipuuro esimerkiksi kanelin ja intiaanisokerin tai haluamiesi marjojen kanssa.\n\n\n\n\n"));
        recipes.add(new Recipe("", "", ""));


    }

    public ArrayList<Recipe>getRecipes(){
        return recipes;
    }
    public String getRecipes(int i){

        return recipes.get(i).getInfo();
    }
}