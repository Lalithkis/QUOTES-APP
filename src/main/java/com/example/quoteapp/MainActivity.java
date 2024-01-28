package com.example.quoteapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;

import com.example.quoteapp.categories.CategoriesAdapter;
import com.example.quoteapp.categories.listcategories;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
   //private final List<listcategories> listcategories = new ArrayList<listcategories>();
    private final List<listcategories> listcategories = new ArrayList<listcategories>();
    private AlertDialog.Builder categoriesRecyclerview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final RecyclerView categories = findViewById(R.id.categories);
        
        categories.setHasFixedSize(true);
        int spanCount = 2;
        categories.setLayoutManager(new GridLayoutManager(MainActivity.this,2));
        
        // add categories to listcategories
        String categoryName;
        String love = "Love";
        listcategories lovecategory = new listcategories("Love", R.drawable.img_4);
        listcategories.add(lovecategory); //add love category to listcategories

        // add categories to listcategories
        listcategories motivationCategory= new listcategories("Motivation", R.drawable.img_1);
        listcategories.add(motivationCategory); //add motivation category to listcategories

        // add categories to listcategories
        listcategories AtitudeCategory= new listcategories("AtitudeCategory",R.drawable.img);
        listcategories.add(AtitudeCategory); //add Atitude category to listcategories

        // add categories to listcategories
        listcategories SuccessCategory= new listcategories("Success",R.drawable.img_3);
        listcategories.add(SuccessCategory); //add English category to listcategories

        // add categories to listcategories
        listcategories lifeCategory= new listcategories("Life", R.drawable.img_2);
        listcategories.add(lifeCategory); //add Life category to listcategories

        // set adapter to recyclerview
        List<listcategories> ListAdapter = null;
        categoriesRecyclerview.setAdapter(new listAdapter(ListAdapter,MainActivity.this));
    }
}