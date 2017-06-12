package com.example.user.testui2;

import android.app.Activity;
import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;
import com.example.user.testui2.mFragments.CrimeFragment;
import com.example.user.testui2.mFragments.DocumentaryFragment;
import com.example.user.testui2.mFragments.DramaFragment;

public class MainActivity extends FragmentActivity implements AHBottomNavigation.OnTabSelectedListener{

    AHBottomNavigation bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigation = (AHBottomNavigation) findViewById(R.id.bottom_navigation_ID);
        bottomNavigation.setOnTabSelectedListener(this);
        this.createNavItems();
    }

    private void createNavItems(){
        AHBottomNavigationItem crime = new AHBottomNavigationItem("Crimes",R.drawable.badge);
        AHBottomNavigationItem documentary = new AHBottomNavigationItem("Documentary",R.drawable.badge);
        AHBottomNavigationItem drama = new AHBottomNavigationItem("Drama",R.drawable.badge);

        bottomNavigation.addItem(crime);
        bottomNavigation.addItem(documentary);
        bottomNavigation.addItem(drama);

        bottomNavigation.setDefaultBackgroundColor(Color.parseColor("#fefefe"));

        bottomNavigation.setCurrentItem(0);
    }


    @Override
    public boolean onTabSelected(int position, boolean wasSelected) {
        if (position == 0){
            CrimeFragment crimeFragment = new CrimeFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.content_id, crimeFragment).commit();
            return true;

        }
        else if (position==1){
            DramaFragment dramaFragment = new DramaFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.content_id, dramaFragment).commit();
            return true;

        }
        else if (position == 3){
            DocumentaryFragment documentaryFragment = new DocumentaryFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.content_id, documentaryFragment).commit();
            return true;
        }
        return false;

    }
}
