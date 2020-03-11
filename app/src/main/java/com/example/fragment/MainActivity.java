package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

//    String[] ListViewNames = new String[]{"Sara", "Morteza", "Mohammad",
//            "Fatemeh", "Layla",
//            "Majid", "Aazam", "Komail", "Kamal", "Shabnam"};
//    String[] ListViewRels = new String[]{"dauther", "father", "grand father",
//            "grand mother", "mother",
//            "older brother", "older sister", "son", "younger brother","younger sister"};
//
//    int[] ListViewImages = new int[]{R.drawable.family_daughter, R.drawable.family_father, R.drawable.family_grandfather,
//            R.drawable.family_grandmother, R.drawable.family_mother,
//            R.drawable.family_older_brother, R.drawable.family_older_sister, R.drawable.family_son,
//            R.drawable.family_younger_brother, R.drawable.family_younger_sister };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        ViewPager viewPager=findViewById(R.id.viewpager);
        MyfragmentAdapter myFragmentAdaper=new MyfragmentAdapter(getSupportFragmentManager());

        TabLayout  tabLayout=findViewById(R.id.tablayout_main);

        tabLayout.setupWithViewPager(viewPager);
        viewPager.setAdapter(myFragmentAdaper);

//
//                getSharedPreferences("sh1", MODE_PRIVATE).edit().putString("string1", "hello sara").commit();
//                String i = getSharedPreferences("sh1", MODE_PRIVATE).getString("string1", "sss");

    }
}


