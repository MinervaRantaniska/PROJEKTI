package com.example.projekti;

public class Recipe {
    private String recipeName;
    private String ingredients;
    private String description;

    public Recipe(String recipeName, String ingredients, String description){
        this.recipeName = recipeName;
        this.ingredients= ingredients;
        this.description = description;

    }
    public String toString(){
        return this.recipeName;
    }
    public String getInfo(){
        return "Ainesosat" + "\n\n" + this.ingredients+"\n\n" + "Tee näin\n\n" + this.description;
    }
}
