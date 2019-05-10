package com.example.projekti;

import java.util.ArrayList;

class MySelectedFodmapsNotes {
    public static final String PREFS_NOTES = "NOTES";
    private static final MySelectedFodmapsNotes ourInstance = new MySelectedFodmapsNotes();

    static MySelectedFodmapsNotes getInstance() {
        return ourInstance;
    }

    public ArrayList<String> selectedItemsNotesArrayList;

    public MySelectedFodmapsNotes() {

        selectedItemsNotesArrayList = new ArrayList<String>();
        //selectedItemsNotesArrayList.addAll(null);
    }

    public void addToMyListOfNotes(String note) {
        selectedItemsNotesArrayList.add(note);

    }

    public void addNote(int i, String note) {
        selectedItemsNotesArrayList.add(i, note);
    }

    public void deleteNote(int i) {
        selectedItemsNotesArrayList.remove(i);
    }

    public ArrayList<String> getMySelectedFodmapsNotesArrayList() {

        return selectedItemsNotesArrayList;
    }

    public String getMySelectedFodmapsNotesArrayList(int i) {

        return selectedItemsNotesArrayList.get(i);
    }
}
