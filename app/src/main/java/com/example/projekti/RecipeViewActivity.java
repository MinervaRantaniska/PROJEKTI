package com.example.projekti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class RecipeViewActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_view);

        Bundle b = getIntent().getExtras();
        int i = b.getInt(RecipesActivity.EXTRA_FROM_RECIPES, -1);
        if(i != -1){
            TextView tv = findViewById(R.id.textViewForRecipes);
            tv.setMovementMethod(new ScrollingMovementMethod());
            tv.setText(RecipesList.getInstance().getRecipes(i));
        }
    }
    public void backToRecipes(View v){
        Intent openRecipes = new Intent(RecipeViewActivity.this, RecipesActivity.class);
        startActivity(openRecipes);
    }
}
