package com.example.tablayoutviewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    private ExploreFragment exploreFragment;
    private FlightsFragment flightsFragment;
    private TravelFragment travelFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.tool);
        toolbar.setTitle("World Travel");

        setSupportActionBar(toolbar);
        viewPager =findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tablayout);

        exploreFragment = new ExploreFragment();
        flightsFragment = new FlightsFragment();
        travelFragment = new TravelFragment();

        tabLayout.setupWithViewPager(viewPager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(),0);
        viewPagerAdapter.addFragment(exploreFragment,"Explore");
        viewPagerAdapter.addFragment(flightsFragment,"Flights");
        viewPagerAdapter.addFragment(travelFragment,"Travel");
        viewPager.setAdapter(viewPagerAdapter);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_map_black_24dp);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_flight_black_24dp);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_card_travel_black_24dp);

    }
}
