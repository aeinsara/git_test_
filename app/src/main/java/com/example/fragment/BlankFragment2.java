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


public class BlankFragment2 extends Fragment {


    public BlankFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank2, container, false);

        String[] ListViewNames = new String[]{"Sefid", "Ghermez", "Zard Tireh",
                "Sabz", "Khakestari",
                "Zard Roshan", "Ghahvie", "Siah"};
        String[] ListViewTranslates = new String[]{"white", "red", "mustard yellow",
                "green", "gray",
                "dusty yellow", "brown", "black"};

        int[] ListViewImages = new int[]{R.drawable.color_white, R.drawable.color_red, R.drawable.color_mustard_yellow,
                R.drawable.color_green, R.drawable.color_gray,
                R.drawable.color_dusty_yellow, R.drawable.color_brown, R.drawable.color_black};

        List<HashMap<String, String>> colorList = new ArrayList<HashMap<String, String>>();

        for (int i = 0; i < 8; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("Names", ListViewNames[i]);
            hm.put("Translates", ListViewTranslates[i]);
            hm.put("Images", Integer.toString(ListViewImages[i]));

            colorList.add(hm);
        }

        String[] from = {
                "Images", "Translates", "Names"
        };

        int[] to = {
                R.id.color_img, R.id.name_color, R.id.translate_color
        };

        SimpleAdapter simpleAdapter = new SimpleAdapter(getActivity(), colorList, R.layout.color_list, from, to);
        ListView simpleListView = (ListView) view.findViewById(R.id.color);
        simpleListView.setAdapter(simpleAdapter);

        // Inflate the layout for this fragment
        return view;

    }
}
