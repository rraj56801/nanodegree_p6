package com.example.android.allahabadtourism.activities;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.ImageView;
import android.widget.VideoView;

import com.example.android.allahabadtourism.R;
import com.example.android.allahabadtourism.fragments.ActivityFragment;
import com.example.android.allahabadtourism.fragments.AttractionFragment;
import com.example.android.allahabadtourism.fragments.FragmentFood;
import com.example.android.allahabadtourism.fragments.FragmentIndustry;
import com.example.android.allahabadtourism.fragments.FragmentShoping;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    ImageView imageView;
    VideoView videoView;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        viewPager.addOnPageChangeListener(pageChangeListener);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new AttractionFragment(),"Attraction");
        adapter.addFragment(new ActivityFragment(),"Activity");
        adapter.addFragment(new FragmentShoping(),"Shopping Center");
        adapter.addFragment(new FragmentIndustry(),"Industry");
        adapter.addFragment(new FragmentFood(),"Food");
         viewPager.setAdapter(adapter);
    }

    //Listener to change header image
    private ViewPager.OnPageChangeListener pageChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            imageView = (ImageView) findViewById(R.id.image_header);
            videoView = (VideoView) findViewById(R.id.videoView);
            switch (position) {
                case 0:
                    imageView.setImageResource(R.drawable.header_activities);
                    break;
                case 1:
                    imageView.setImageResource(R.drawable.header_activities);
                    break;
            }
        }

        @Override
        public void onPageSelected(int position) {
        }

        @Override
        public void onPageScrollStateChanged(int state) {
        }
    };

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}