package com.example.iirol.harjoitus4;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private LinearLayout laskuriPaneeli;
    private LinearLayout historiaPaneeli;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_laskuri:
                    laskuriPaneeli.setVisibility(View.VISIBLE);
                    historiaPaneeli.setVisibility(View.GONE);
                    return true;
                case R.id.navigation_historia:
                    laskuriPaneeli.setVisibility(View.GONE);
                    historiaPaneeli.setVisibility(View.VISIBLE);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.laskuriPaneeli = (LinearLayout)findViewById(R.id.laskuripaneeli);
        this.historiaPaneeli = (LinearLayout)findViewById(R.id.historiapaneeli);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
