package com.nitukbt19.StudentBuddy.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.nitukbt19.StudentBuddy.Fragment.StudentFragment;
import com.nitukbt19.StudentBuddy.Fragment.TeacherFragment;

public class FragmentAdapter extends FragmentPagerAdapter {
    public FragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new StudentFragment();
            case 1: return new TeacherFragment();
            default:return new StudentFragment();
        }

    }

    @Override
    public int getCount() {
        return 2;
    }

   @Nullable
   @Override
   public CharSequence getPageTitle(int position) {
        String Tittle =null;
        if(position==0){
            Tittle = "Student";
        }
        if(position==1){
            Tittle = "Teacher";
        }
        return super.getPageTitle(position);
    }
}
