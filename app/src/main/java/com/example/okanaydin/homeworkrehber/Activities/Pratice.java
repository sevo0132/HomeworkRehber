package com.example.okanaydin.homeworkrehber.Activities;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.okanaydin.homeworkrehber.FragmentAdapterClass;
import com.example.okanaydin.homeworkrehber.R;

public class Pratice extends AppCompatActivity {


    Toolbar toolbar ;
    TabLayout tabLayout ;
    ViewPager viewPager ;
    FragmentAdapterClass fragmentAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pratice);

        toolbar = (Toolbar) findViewById(R.id.toolbar1);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout1);
        viewPager = (ViewPager) findViewById(R.id.pager1);

        setSupportActionBar(toolbar);

        tabLayout.addTab(tabLayout.newTab().setText("Currency & ATM’S"));
        tabLayout.addTab(tabLayout.newTab().setText("Driver’s Licence"));
        tabLayout.addTab(tabLayout.newTab().setText("Hospitals"));
        tabLayout.addTab(tabLayout.newTab().setText("Post & Communications"));
        tabLayout.addTab(tabLayout.newTab().setText("Time Zone"));

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        fragmentAdapter = new FragmentAdapterClass(getSupportFragmentManager(), tabLayout.getTabCount());

        viewPager.setAdapter(fragmentAdapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab LayoutTab) {

                viewPager.setCurrentItem(LayoutTab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab LayoutTab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab LayoutTab) {

            }
        });
    }
}
