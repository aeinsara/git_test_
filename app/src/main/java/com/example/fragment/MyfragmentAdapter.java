package com.example.fragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyfragmentAdapter
        extends FragmentPagerAdapter {
     public MyfragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:{
                return new BlankFragment1();
            }
            case 1:{
                return new BlankFragment2();
            }
            case 2:{
                return new BlankFragment3();
            }
            case 3:{
                return new BlankFragment4();
            }
        }

        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:{
                return  "FAMILY";
            }
            case 1:{
                return  "COLORS";
            }
            case 2:{
                return  "NUMBERS";
            }
            case 3:{
                return  "PHRASES";
            }
        }
        return "";
    }
}
