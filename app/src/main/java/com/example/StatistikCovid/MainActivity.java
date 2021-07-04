package com.example.StatistikCovid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigation;
    private Fragment fragment;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final BottomNavigationView bottom = findViewById(R.id.navigasi_bawah);
        fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction().replace(R.id.layoutitem,new FragmentHome()).commit();

        bottom.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_home:
                         fragment = new FragmentHome();
                        break;
                    case R.id.menu_profile:
                         fragment = new FragmentRS();
                        break;


                }

                final FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.layoutitem, fragment).commit();
                return true;
            }
        });


    }
}