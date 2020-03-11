package com.example.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class BlankFragment4 extends Fragment {


    public BlankFragment4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_blank4, container, false);

        String[] ListViewNames = new String[]{"asan", "sakht", "khoob",
                "salam", "khodahafez",
                "boro", "bia", "man", "ma", "an"};
        String[] ListViewTranslates = new String[]{"easy", "hard", "fine",
                "hello", "goodbye",
                "go", "come", "I", "we","that"};

        int[] ListViewImages = new int[]{R.drawable.number_one, R.drawable.number_two, R.drawable.number_three,
                R.drawable.number_four, R.drawable.number_five,
                R.drawable.number_six, R.drawable.number_seven, R.drawable.number_eight,
                R.drawable.number_nine, R.drawable.number_ten };

        List<HashMap<String, String>> phraseList = new ArrayList<HashMap<String, String>>();

        for(int i = 0; i < 8; i++){
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("Names", ListViewNames[i]);
            hm.put("Translates", ListViewTranslates[i]);
            hm.put("Images", Integer.toString(ListViewImages[i]));

            phraseList.add(hm);
        }

        String[] from = {
                "Images", "Translates", "Names"
        };

        int[] to = {
                R.id.phrase_img, R.id.name_phrase, R.id.translate_phrase
        };

        SimpleAdapter simpleAdapter = new SimpleAdapter(getActivity(), phraseList, R.layout.phrase_list, from, to);
        ListView simpleListView = (ListView) view.findViewById(R.id.phrase);
        simpleListView.setAdapter(simpleAdapter);

        // Inflate the layout for this fragment
        return view;
    }
}
