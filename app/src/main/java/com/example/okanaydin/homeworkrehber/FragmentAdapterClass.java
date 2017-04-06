package com.example.okanaydin.homeworkrehber;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.okanaydin.homeworkrehber.TabPratice.Tab1;
import com.example.okanaydin.homeworkrehber.TabPratice.Tab2;
import com.example.okanaydin.homeworkrehber.TabPratice.Tab3;
import com.example.okanaydin.homeworkrehber.TabPratice.Tab4;
import com.example.okanaydin.homeworkrehber.TabPratice.Tab5;

/**
 * Created by okanaydin on 04/04/17.
 */

public class FragmentAdapterClass extends FragmentStatePagerAdapter {

    int TabCount;

    public FragmentAdapterClass(FragmentManager fragmentManager, int CountTabs) {

        super(fragmentManager);

        this.TabCount = CountTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Tab1 tab1 = new Tab1();
                return tab1;

            case 1:
                Tab2 tab2 = new Tab2();
                return tab2;

            case 2:
                Tab3 tab3 = new Tab3();
                return tab3;

            case 3:
                Tab4 tab4 = new Tab4();
                return tab4;

            case 4:
                Tab5 tab5 = new Tab5();
                return tab5;



            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return TabCount;
    }
}