package com.example.projekti;

import java.util.ArrayList;

class MySelectedFodmapsColors {
    public static final String PREFS_COLORS = "COLORS";

    private static final MySelectedFodmapsColors ourInstance = new MySelectedFodmapsColors();

    static MySelectedFodmapsColors getInstance() {
        return ourInstance;
    }

    public ArrayList<String> selectedItemsColorsArrayList;

    private MySelectedFodmapsColors() {
        selectedItemsColorsArrayList = new ArrayList<String>();
    }

    public void addToMyListOfColors(String color) {
        selectedItemsColorsArrayList.add(color);

    }

    public void addColor(int i, String color) {

        selectedItemsColorsArrayList.add(i, color);

    }

    public ArrayList<String> getMySelectedFodmapsColorsArrayList() {

        return selectedItemsColorsArrayList;
    }

    public String getMySelectedFodmapsColorsArrayList(int i) {

        return selectedItemsColorsArrayList.get(i);
    }
}
