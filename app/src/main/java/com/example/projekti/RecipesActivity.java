package com.example.projekti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

public class RecipesActivity extends AppCompatActivity {

    private ListView myrecipes;
    private SearchView recipeSearchView;
    public static final String EXTRA_FROM_RECIPES = "recipeKey";
    //private ArrayList<President> presidents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);


        myrecipes = (ListView) findViewById(R.id.recipeListView);


        final ArrayAdapter<Recipe> arrayAdapter = new ArrayAdapter<Recipe>(
                this,
                android.R.layout.simple_list_item_1,
                RecipesList.getInstance().getRecipes());

        myrecipes.setAdapter(arrayAdapter);



        myrecipes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Log.d(TAG, "onItemClick(" + i + ")");
                Intent openRecipesView = new Intent(RecipesActivity.this, RecipeViewActivity.class);
                openRecipesView.putExtra(EXTRA_FROM_RECIPES, i);
                startActivity(openRecipesView);
            }
        });

    }
    public void toMain(View v){
        Intent openMain = new Intent (RecipesActivity.this, MainActivity.class);
        startActivity(openMain);
    }
    public void toMyList(View v){
        Intent openMyList = new Intent (RecipesActivity.this, OmalistaActivity.class);
        startActivity(openMyList);
    }
    public void toDiary(View v){
        Intent openDiary = new Intent (RecipesActivity.this, PaivakirjaActivity.class);
        startActivity(openDiary);
    }
}
