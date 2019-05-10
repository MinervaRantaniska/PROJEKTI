package com.example.projekti;

import java.util.ArrayList;

class MyDiaryNotes {                    //singelton päiväkirjamerkinnälle

    public static final String PREFS_N = "buu";
    private static final MyDiaryNotes ourInstance = new MyDiaryNotes();
    public ArrayList<String> addedDiaryNotes;

    public MyDiaryNotes() {
        addedDiaryNotes = new ArrayList<String>();

    }

    static MyDiaryNotes getInstance() {
        return ourInstance;
    }

    public void addToMyDiary(String name) {
        addedDiaryNotes.add(name);

    }

    public void removeFromMyDiary(String name) {
        addedDiaryNotes.remove(name);
    }

    public ArrayList<String> getMySelectedDiaryArrayList() {

        return addedDiaryNotes;
    }

    public String getMySelectedDiaryArrayList(int i) {
        return addedDiaryNotes.get(i);
    }

}
