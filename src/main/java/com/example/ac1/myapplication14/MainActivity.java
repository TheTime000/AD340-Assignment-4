package com.example.ac1.myapplication14;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;

import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private ViewPager mViewPager;
    private static final String TAG="MainActivity";
    private SectionPageAdapter mSectionPageAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Starting.");
        mSectionPageAdapter = new SectionPageAdapter(getSupportFragmentManager());

        //set up the viewpager with the sections adaptor
        mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(res.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }

    private void setupViewPager(ViewPager viewPager){
        SectionPageAdapter adapter = new SectionPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new fragment1_class(), "Profile");
        adapter.addFragment(new fragment2_class(), "Online");
        adapter.addFragment(new fragment3_class(), "Chat");
        viewPager.setAdapter(adapter);
    }

}
