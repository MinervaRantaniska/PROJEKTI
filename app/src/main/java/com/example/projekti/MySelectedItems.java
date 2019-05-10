package com.example.projekti;


import java.util.ArrayList;

public class MySelectedItems {

    public static final String PREFS_NAME = "BLABLA";
    private static final MySelectedItems ourInstance = new MySelectedItems();
    public ArrayList<String> selectedItemsArrayList;

    public MySelectedItems() {
        selectedItemsArrayList = new ArrayList<String>();

    }


    static MySelectedItems getInstance() {
        return ourInstance;
    }

    public void addToMyList(String name) {
        selectedItemsArrayList.add(name);

    }

    /*public void addOwnItemToOwnList(String name){
        selectedItemsArrayList.add(name);
    }*/
    public void removeFromMyList(String name) {
        selectedItemsArrayList.remove(name);
    }

    public ArrayList<String> getMySelectedItemsArrayList() {

        return selectedItemsArrayList;
    }
    public int getIndex(String name){

        int indexOfItem = selectedItemsArrayList.indexOf(name);
        if(indexOfItem != -1){
            return indexOfItem;
        }
        return -1;

    }

    public String getMySelectedItemsArrayList(int i) {
        return selectedItemsArrayList.get(i);
    }

}


