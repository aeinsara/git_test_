package com.example.fragment;

import android.content.Context;
import android.net.Uri;
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


public class BlankFragment3 extends Fragment {


    public BlankFragment3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_blank3, container, false);

        String[] ListViewNames = new String[]{"Yek", "Doo", "Se",
                "Chahar", "Pang",
                "Shesh", "Haft", "Hasht", "Noh", "Dah"};
        String[] ListViewTranslates = new String[]{"one", "two", "three",
                "four", "five",
                "six", "seven", "eight", "nine","ten"};

        int[] ListViewImages = new int[]{R.drawable.number_one, R.drawable.number_two, R.drawable.number_three,
                R.drawable.number_four, R.drawable.number_five,
                R.drawable.number_six, R.drawable.number_seven, R.drawable.number_eight,
                R.drawable.number_nine, R.drawable.number_ten };

        List<HashMap<String, String>> numberList = new ArrayList<HashMap<String, String>>();

        for(int i = 0; i < 10; i++){
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("Names", ListViewNames[i]);
            hm.put("Translates", ListViewTranslates[i]);
            hm.put("Images", Integer.toString(ListViewImages[i]));

            numberList.add(hm);
        }

        String[] from = {
                "Images", "Translates", "Names"
        };

        int[] to = {
                R.id.number_img, R.id.name_number, R.id.translate_number
        };

        SimpleAdapter simpleAdapter = new SimpleAdapter(getActivity(), numberList, R.layout.number_list, from, to);
        ListView simpleListView = (ListView) view.findViewById(R.id.number);
        simpleListView.setAdapter(simpleAdapter);

        // Inflate the layout for this fragment
        return view;
    }

}
