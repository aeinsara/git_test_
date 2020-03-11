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

public class BlankFragment1 extends Fragment {

    public BlankFragment1() {
        // Required empty public constructor


    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_blank1, container, false);

        String[] ListViewNames = new String[]{"dokhtar", "baba", "baba bozorg",
                "madar bozorg", "madar",
                "baradar bozorg", "khahar bozorg", "pesar", "baradar kochak", "khahar kochak"};
        String[] ListViewTranslates = new String[]{"dauther", "father", "grand father",
                "grand mother", "mother",
                "older brother", "older sister", "son", "younger brother","younger sister"};

        int[] ListViewImages = new int[]{R.drawable.family_daughter, R.drawable.family_father, R.drawable.family_grandfather,
                R.drawable.family_grandmother, R.drawable.family_mother,
                R.drawable.family_older_brother, R.drawable.family_older_sister, R.drawable.family_son,
                R.drawable.family_younger_brother, R.drawable.family_younger_sister };

        List<HashMap<String, String>> familyList = new ArrayList<HashMap<String, String>>();

        for(int i = 0; i < 10; i++){
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("Names", ListViewNames[i]);
            hm.put("Translates", ListViewTranslates[i]);
            hm.put("Images", Integer.toString(ListViewImages[i]));

            familyList.add(hm);
        }

        String[] from = {
                "Images", "Translates", "Names"
        };

        int[] to = {
                R.id.family_img, R.id.name_family, R.id.translate_family
        };

        SimpleAdapter simpleAdapter = new SimpleAdapter(getActivity(), familyList, R.layout.family_list, from, to);
        ListView simpleListView = (ListView) view.findViewById(R.id.Family);
        simpleListView.setAdapter(simpleAdapter);

        // Inflate the layout for this fragment
        return view;


    }


}
