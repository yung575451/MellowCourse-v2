package com.hungphamcom.mellowcourse;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.hungphamcom.mellowcourse.adapter.viewPagerAdapter;
import com.hungphamcom.mellowcourse.fragment.HomeFragment;

public class MainScreen extends AppCompatActivity implements View.OnClickListener  {
    public static ViewPager2 mViewPager;
    private TabLayout mTabLayout;
    private ImageView mLogo_MainScreen;
    private TextView buyNowBtn;
    private ImageView addItem;
    private com.hungphamcom.mellowcourse.adapter.viewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        addItem=findViewById(R.id.addItem_mainScreen);

        mViewPager=findViewById(R.id.viewpager);
        mTabLayout=findViewById(R.id.tabLayout);
        viewPagerAdapter=new viewPagerAdapter(this);
        mViewPager.setAdapter(viewPagerAdapter);
        mLogo_MainScreen=findViewById(R.id.logo_mainScreen);
        mLogo_MainScreen.setOnClickListener(this);

        tabLayoutValueSetter();
        addItem.setOnClickListener(this);

    }
    private void tabLayoutValueSetter() {


        final String[] tabTitles = {"Home", "Shop", "Wishlist","Profile"};//put titles based on your need
        final int[] tabIcons = {R.drawable.ic_home_2, R.drawable.ic_shop
                , R.drawable.ic_akar_icons_heart,R.drawable.ic_frame};


        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(mTabLayout, mViewPager,
                new TabLayoutMediator.TabConfigurationStrategy() {
                    @Override
                    public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                        tab.setText(tabTitles[position]);
                        tab.setIcon(tabIcons[position]);
                        tab.select();
                    }
                }
        );
        tabLayoutMediator.attach();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.logo_mainScreen:
                mViewPager.setCurrentItem(0);
                break;
            case R.id.addItem_mainScreen:
                //Toast.makeText(this, "add Item has been pressed", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainScreen.this,add_new_item.class));
                break;
        }
    }
}