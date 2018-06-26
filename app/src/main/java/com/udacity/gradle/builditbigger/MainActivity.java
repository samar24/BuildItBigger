package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.MobileAds;

import example.samar.myjavalib.MyClass;


public class MainActivity extends AppCompatActivity {
    private MyClass joker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");
    }

    public void tellJoke(View view) {

        Toast.makeText(this, joker.getJoke(), Toast.LENGTH_SHORT).show();
    }


}
