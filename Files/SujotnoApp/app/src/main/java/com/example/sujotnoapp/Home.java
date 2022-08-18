package com.example.sujotnoapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Home extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    SettingFragment settingFragment = new SettingFragment();
    HomeFragment homeFragment = new HomeFragment();

    AddFragment addFragment = new AddFragment();

    NoticeFragment noticeFragment = new NoticeFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

       bottomNavigationView = findViewById(R.id.bottom_nav);

        getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected( MenuItem item) {

                switch (item.getItemId()) {

                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();
                        return true;

                    case R.id.setting:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,settingFragment).commit();
                        return true;

                    case R.id.add:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,addFragment).commit();
                        return true;

                    case R.id.notice:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,noticeFragment).commit();
                        return true;

                }
                return false;
            }
        });


    }
}