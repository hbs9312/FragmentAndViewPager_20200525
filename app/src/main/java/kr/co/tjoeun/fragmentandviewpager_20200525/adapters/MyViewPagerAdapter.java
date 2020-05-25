package kr.co.tjoeun.fragmentandviewpager_20200525.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import kr.co.tjoeun.fragmentandviewpager_20200525.fragments.FirstFragment;
import kr.co.tjoeun.fragmentandviewpager_20200525.fragments.SecondFragment;
import kr.co.tjoeun.fragmentandviewpager_20200525.fragments.ThirdFragment;

public class MyViewPagerAdapter extends FragmentPagerAdapter {

    public MyViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        if(position == 0 ) {
            return new FirstFragment();
        }
        else if(position == 1) {
            return new SecondFragment();
        }
        else {
            return new ThirdFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
